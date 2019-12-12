package com.lambton.pocket.adamMckinlay.pocket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	@NotEmpty
	@Size(min=3)
	private String firstName;
	
	@NotNull
	@NotEmpty
	@Size(min=4)
	private String lastName;
	
	@NotNull
	@Column(unique=true)
	@Min(111111111)
	@Max(999999999)
	private Integer sin;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getSin() {
		return sin;
	}
	public void setSin(Integer sin) {
		this.sin = sin;
	}
}
