package com.lambton.pocket.adamMckinlay.pocket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accNum;
	
	@NotNull
	private Integer clientID;
	
	@NotNull
	private String type;
	
	@NotNull
	private Double balance;
	
	@NotNull
	private String openDate;

	public Integer getAccNum() {
		return accNum;
	}

	public void setAccNum(Integer accNum) {
		this.accNum = accNum;
	}

	public Integer getClientID() {
		return clientID;
	}

	public void setClientID(Integer clientID) {
		this.clientID = clientID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
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
