//Almicke Navarro and Emily Quevedo
//CST-341
//September 20, 2019 
//This is our own work. 

//MODEL 
//this is the credentials object model; this page will hold the attributes, constructors, getters, and setters for the user's credentials

package com.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Credentials {
	//attributes
	//all set to @NotNull to validate that the user inputs info 
	
	@NotNull(message = "Username cannot be null.")
	@Size(min=3, max=30, message="Username must be between 3 and 30 characters.")
	private String username; 
	
	@NotNull(message = "Password cannot be null.")
	@Size(min=3, max=30, message="Password must be between 3 and 30 characters.")
	private String password;
	
	//constructors
	public Credentials() {
		this.username = "";
		this.password = "";
	}
    
	public Credentials(@NotNull(message = "Username cannot be null.") @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters.") String username,
			@NotNull(message = "Password cannot be null.") @Size(min = 3, max = 30, message = "Password must be between 3 and 30 characters.") String password) {
		super();
		this.username = username;
		this.password = password;
	}

	//getters and setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}