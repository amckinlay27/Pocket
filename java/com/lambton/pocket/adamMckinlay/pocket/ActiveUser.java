package com.lambton.pocket.adamMckinlay.pocket;

import java.util.ArrayList;
import java.util.List;

public class ActiveUser {
	private Client client;
	private Users user;
	private List<Accounts> accounts;
	private List<Transactions> transactions;
	private String email;
	
	public ActiveUser() {
		this.client = null;
		this.user = null;
		this.accounts = new ArrayList<Accounts>();
		this.transactions = new ArrayList<Transactions>();
		this.email = null;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public List<Accounts> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFullName() {
		return this.client.getFirstName() + " " + this.client.getLastName();
	}
	
	public String getFullAddress() {
		return this.user.getAddress() + ", " + this.user.getCity() + " " + this.user.getProvince() + ", " + this.user.getPostal();
	}
	
	public String getJoinDateYear() {
		return this.user.getJoinDate().substring(0,this.user.getJoinDate().indexOf("-"));
	}
	
	public void resetActiveUser() {
		this.client = null;
		this.user = null;
		this.accounts = new ArrayList<Accounts>();
		this.transactions = new ArrayList<Transactions>();
		this.email = null;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
