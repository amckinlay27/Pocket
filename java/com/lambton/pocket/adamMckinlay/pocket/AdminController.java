package com.lambton.pocket.adamMckinlay.pocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@Autowired
	private ClientRepository clientDB;
	
	@Autowired
	private UserRepository userDB;
	
	@Autowired
	private AccountRepository accountDB;
	
	@Autowired
	private TransactionRepository transactionDB;
	
	/*Access Info*/
	@GetMapping("/listClients")
	public Iterable<Client> getClients(){
		return clientDB.findAll();
	}
	
	@GetMapping("/listUsers")
	public Iterable<Users> getUsers(){
		return userDB.findAll();
	}
	
	@GetMapping("/listAccounts")
	public Iterable<Accounts> getAccounts(){
		return accountDB.findAll();
	}
	
	@GetMapping("/listTransactions")
	public Iterable<Transactions> getTransactions(){
		return transactionDB.findAll();
	}
	
	/*Delete Info*/
	@GetMapping("/deleteTransactions")
	public String deleteTransactions(){
		transactionDB.deleteAllTransactions();
		return "Transactions deleted";
	}
	
	@GetMapping("/deleteAccounts")
	public String deleteAccounts(){
		accountDB.deleteAllAccounts();
		return "Accounts deleted";
	}
	
	@GetMapping("/deleteClients")
	public String deleteClients(){
		clientDB.deleteAllClients();
		return "Clients deleted";
	}
	
	@GetMapping("/deleteUsers")
	public String deleteUsers(){
		userDB.deleteAllUsers();
		return "Users deleted";
	}
}
