//Almicke Navarro and Emily Quevedo
//CST-341
//October 11, 2019
//User Interface class that will be implemented in the User SpringBean
package com.business;

import com.model.User;

public interface UserBusinessInterface {
	//CRUD operations
	public boolean create(User user);
	public User findByUsername(User user);
	public boolean update(int id, User user);
	public boolean delete(int id);
}
