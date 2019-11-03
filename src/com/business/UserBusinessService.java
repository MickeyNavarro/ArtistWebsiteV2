//Almicke Navarro and Emily Quevedo
//CST-341
//October 11, 2019
//User SpringBean 
package com.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.data.UserDataAccessInterface;
import com.model.User;

public class UserBusinessService implements UserBusinessInterface {
	@SuppressWarnings("rawtypes")
	@Autowired
	UserDataAccessInterface dao;
	
	//create a new user
	@SuppressWarnings("unchecked")
	public boolean create(User user) {
		return dao.create(user);
	}
	//find user by username (used for login)
	@SuppressWarnings("unchecked")
	public User findByUsername(User user) {
		return dao.findByUsername(user);
	}
	//update user info
	public boolean update(int id, User user) {
		return false;
	}
	//delete user
	public boolean delete(int id) {
		return false;
	}
}
