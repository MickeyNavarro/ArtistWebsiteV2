//Almicke Navarro and Emily Quevedo
//CST-341
//October 26, 2019
//User Data Interface class that will be implemented in the User SpringBean
package com.data;

import com.model.User;

public interface UserDataAccessInterface<T> {
  //CRUD operations
	public User findByUsername(T t);
	public boolean create(T t);
	public boolean update(T t);
	public boolean delete(T t);
}
