package com.lambton.pocket.adamMckinlay.pocket;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginSessionController {
	@Autowired
	private UserRepository userDB;
	
	@Autowired
	private ClientRepository clientDB;
	
	@Autowired
	private AccountRepository accountDB;
	
	@Autowired
	private TransactionRepository transactionDB;
	
	@Autowired
	private ActiveUser activeUser;
	
	@PostMapping("/AttemptLogin")
	public String confirmUser(@RequestParam String email, @RequestParam String password, Model model) {
		//Account Locked
		if(email != null && userDB.getLoginAttemptsByEmail(email) != null && userDB.getLoginAttemptsByEmail(email).intValue() == 5) {
			model.addAttribute("user_message","Users account " + email + " locked.");
			return "/login.html";
		}
		
		//Currently logged in
		if(activeUser.getEmail() != null){
			return "/user/postToUser";
		}
		
		//Email or password empty
		if(email.equals("") || password.equals("")) {
			model.addAttribute("user_message","Please fill in your email and password.");
			return "login";
	    }
		
		//No account found
		else if(userDB.getUserEmailByEmail(email) == null) {
			model.addAttribute("user_message","No account found.");
			return "login";
		}
		
		//Invalid Password
		else if(!userDB.getPasswordByEmail(email).equals(password)) {
			if(userDB.getLoginAttemptsByEmail(email).intValue() == 3) {
				model.addAttribute("user_message","Password invalid. You have one attempt remaing to log in.");
			}else {
				model.addAttribute("user_message","Password invalid.");
			}
			userDB.updateLoginAttemptsByEmail((userDB.getLoginAttemptsByEmail(email).intValue()+1), email);
			System.out.println("Updated login attempt for: " + email);
			return "login";
		}
		/*Process to Database*/
		//Client ID
		Integer clientID = userDB.getClientIdByEmail(email);
		
		//Accounts
		List<Accounts> accounts = accountDB.getAccountsByClientId(clientID);
		
		//Transactions
		List<Transactions> allTransactions = transactionDB.getAllTransactions();
		List<Transactions> userTransactions = allTransactions.stream()
															 .filter(tr -> accounts.stream()
																	 			   .anyMatch(acc -> acc.getAccNum().intValue() == tr.getAccount().intValue() && acc.getClientID().intValue() == tr.getClient().intValue()))
															 .collect(Collectors.toList());
		//Set Active User Properties
		activeUser.setClient(clientDB.getClient(clientID));
		activeUser.setUser(userDB.getUserByEmail(email));
		activeUser.setEmail(email);
		activeUser.setAccounts(accounts);
		activeUser.setTransactions(userTransactions);
		
		//Reset Login Attempts
		userDB.updateLoginAttemptsByEmail(0, email);
		model.addAttribute("id",clientID);
		return "/user/postToUser";
	}
	
	@PostMapping("/UserAccount")
	public String setUserPage(Model m) {
		m.addAttribute("user_name", activeUser.getFullName());
		m.addAttribute("user_address", activeUser.getFullAddress());
		m.addAttribute("user_email", activeUser.getEmail());
		m.addAttribute("user_cell", activeUser.getUser().getCell());
		m.addAttribute("user_join_date", activeUser.getJoinDateYear());
		m.addAttribute("accounts", activeUser.getAccounts());
		m.addAttribute("transactions", activeUser.getTransactions());
		return "/user/user";
	}
	
	@GetMapping("/user/postToUser")
	public String getUserPage() {
		return "/user/postToUser";
	}
	
	@GetMapping("/logOut")
	public String logout() {
		activeUser.resetActiveUser();
		return "index";
	}
}
