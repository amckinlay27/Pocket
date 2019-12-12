package com.lambton.pocket.adamMckinlay.pocket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

@Entity
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer transactionId;
	
	@NotNull
	private Integer clientID;
	
	@NotNull
	private Integer accountID;
	
	@NotNull
	private String type;
	
	@Nullable
	private String memo;
	
	@Nullable
	private Integer accRecp;
	
	@Nullable
	private String recpi;
	
	@NotNull
	private Double amount;
	
	@Nullable
	private String postDate;
	
	@Nullable
	private String processDate;

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getClient() {
		return clientID;
	}

	public void setClient(Integer clientID) {
		this.clientID = clientID;
	}

	public Integer getAccount() {
		return accountID;
	}

	public void setAccount(Integer accountID) {
		this.accountID = accountID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getAccRecp() {
		return accRecp;
	}

	public void setAccRecp(Integer accRecp) {
		this.accRecp = accRecp;
	}

	public String getRecpi() {
		return recpi;
	}

	public void setRecpi(String recpi) {
		this.recpi = recpi;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public String getProcessDate() {
		return processDate;
	}

	public void setProcessDate(String processDate) {
		this.processDate = processDate;
	}
}
