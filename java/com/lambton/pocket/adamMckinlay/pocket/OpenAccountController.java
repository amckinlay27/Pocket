package com.lambton.pocket.adamMckinlay.pocket;

import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OpenAccountController{
	@Autowired
	private ClientRepository clientDB;
	
	@Autowired
	private UserRepository userDB;
	
	@Autowired
	private AccountRepository accountDB;
	
	@Autowired
	private TransactionRepository transactionDB;

	
	@PostMapping("/user/open.html")
	public String showForm(Model model) {
		model.addAttribute("account", new Accounts());
		model.addAttribute("client", new Client());
		model.addAttribute("user", new Users());
		return "/user/open.html";
	}
	
	@PostMapping("/createAccount")
	public String valNewAccount(@ModelAttribute(value="account") @Valid Accounts account, BindingResult bindingResultAccount, @ModelAttribute(value="client") @Valid Client client, BindingResult bindingResultClient, @ModelAttribute(value="user") @Valid Users user, BindingResult bindingResultUser,  Accounts acc, Transactions welcomeBalance, Model model) {
		//Check is email with password or sin are already in use
		if(bindingResultUser.hasErrors() || bindingResultClient.hasErrors() || (userDB.getUserEmailByEmail(user.getEmail()) != null && user.getEmail().equals(userDB.getUserEmailByEmail(user.getEmail()))) || (clientDB.getClientSINBySIN(client.getSin()) != null && client.getSin().intValue() == clientDB.getClientSINBySIN(client.getSin()).intValue()) ) {
			if((userDB.getUserEmailByEmail(user.getEmail()) != null) && (user.getEmail().equals(userDB.getUserEmailByEmail(user.getEmail())))) {
				model.addAttribute("user_message","You already have an account. Login with " +  user.getEmail() + " to view your account.");
			}
			if((clientDB.getClientSINBySIN(client.getSin()) != null && client.getSin() != null) && (client.getSin().intValue() == clientDB.getClientSINBySIN(client.getSin()).intValue())) {
				model.addAttribute("user_message_two","The SIN number you entered is already registered with another account.");
			}
			return "/user/open.html";
		}else {
			/*Process New Account*/
			Date today = new Date();
			clientDB.save(client);
			System.out.println("Processed Client - Saved");
			
			user.setClientID(clientDB.getClient(client.getId()).getId());
			user.setJoinDate("2019-12-08");
			userDB.save(user);
			System.out.println("Processed Users - Saved");
			
			acc.setClientID(clientDB.getClient(client.getId()).getId());
			acc.setBalance(500.00);
			acc.setOpenDate(today.toString());
			accountDB.save(acc);
			System.out.println("Processed Accounts - Saved");
			
			welcomeBalance.setClient(clientDB.getClient(client.getId()).getId());
			welcomeBalance.setAccount(accountDB.getAccount(acc.getAccNum(), client.getId()).getAccNum());
			welcomeBalance.setType("Debit");
			welcomeBalance.setMemo("Welcome to Pocket");
			welcomeBalance.setPostDate(today.toString());
			welcomeBalance.setProcessDate(today.toString());
			welcomeBalance.setAmount(500.00);
			transactionDB.save(welcomeBalance);
			
			System.out.println("Processed Transactions");
			return "/user/accountCreated.html";
		}
	}
}
