//Almicke Navarro and Emily Quevedo
//CST-341
//September 16, 2019 
//This is our own work. 

//MODEL 
//this is the user object model; this page will hold the attributes, constructors, getters, and setters for a user

package com.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	//attributes
		//all set to @NotNull to validate that the user inputs info 
	
	@NotNull(message = "First name cannot be null.")
	@Size(min=3, max=30, message="First name must be between 2 and 30 characters.")
	private String firstName; 
	
	@NotNull(message = "Last name cannot be null.")
	@Size(min=3, max=30, message="Last name must be between 2 and 30 characters.")
	private String lastName;
	
	@NotNull(message = "Username cannot be null.")
	@Size(min=3, max=30, message="Username must be between 3 and 30 characters.")
	private String username; 
	
	@NotNull(message = "Email cannot be null.")
	//@Email(message = "Email must be valid.")
	@Size(min=3, message = "Email cannot be an empty.")
	private String email; 
	
	@NotNull(message = "Phone Number cannot be null.")
	@Size(min=10, max=10, message="Phone Number must be a valid length of 10 characters.")
	private String phoneNumber; 
	
	@NotNull(message = "Password cannot be null.")
	@Size(min=3, max=30, message="Password must be between 3 and 30 characters.")
	private String password;
	
	//constructors 
	public User() {
		this.firstName = ""; 
		this.lastName = ""; 
		this.username = "";
		this.email = "";
		this.phoneNumber = "";
		this.password = "";
	}
	
	public User(
			@NotNull(message = "First name cannot be null.") @Size(min = 3, max = 30, message = "First name must be between 2 and 30 characters.") String firstName,
			@NotNull(message = "Last name cannot be null.") @Size(min = 3, max = 30, message = "Last name must be between 2 and 30 characters.") String lastName,
			@NotNull(message = "Username cannot be null.") @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters.") String username,
			@NotNull(message = "E-mail cannot be null.") @Size(min=3, message = "Email cannot be an empty.") String email,
			@NotNull(message = "Phone Number cannot be null.") @Size(min = 10, max = 10, message = "Phone Number must be a valid length.") String phoneNumber,
			@NotNull(message = "Password cannot be null.") @Size(min = 3, max = 30, message = "Password must be between 3 and 30 characters.") String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	
	//getters and setters 
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
}