package com.lambton.pocket.adamMckinlay.pocket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.lang.Nullable;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userID;
	
	@Email
	@NotNull
	private String email;
	
	@Nullable
	private Integer clientID;
	
	@NotNull
	@Size(min=10, max=20)
	private String password;
	
	@NotNull
	@Size(min=10, max=10)
	private String cell;
	
	@NotNull
	@Size(min=2, max=25)
	private String province;
	
	@NotNull
	@Size(min=4, max=40)
	private String city;
	
	@NotNull
	@Size(min=10, max=100)
	private String address;
	
	@NotNull
	@Size(min=6, max=6)
	private String postal;
	
	@Nullable
	private String joinDate;
	
	@NotNull
	private Integer loginAttempts = 0;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getClientID() {
		return clientID;
	}

	public void setClientID(Integer clientID) {
		this.clientID = clientID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public Integer getLoginAttempts() {
		return loginAttempts;
	}
}
