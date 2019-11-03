//Almicke Navarro and Emily Quevedo
//CST-341
//October 27, 2019 
//This is our own work.

//DATA SERVICE 
//this is the user data service; this will deal with any CRUD operations when interacting with the database
package com.data;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.model.User;

public class UserDataService implements UserDataAccessInterface <User>{
	@SuppressWarnings("unused")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	//Default constructor
	public UserDataService() {
		//
	}

	//find user by username (login)
		@Override
		public User findByUsername(User t) {
			//output statement for console
			System.out.println("Entering UserDataService.findByUsername()");

			User user = null;
			String sql = "SELECT * FROM user WHERE BINARY username = ? AND password = ?";

			try {
				SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql, t.getUsername(), t.getPassword());
				if(srs.next()) {
					System.out.println("Exit UserDataService.findByUsername() with true");
					int ID = srs.getInt("ID");
					String firstName = srs.getString("firstName");
					String lastName = srs.getString("lastName");
					String username = srs.getString("username");
					String email = srs.getString("email");
					String phone = srs.getString("phoneNumber");
					String password = srs.getString("password");
					int role = srs.getInt("role");
					user = new User(ID, firstName, lastName, username, email, phone, password, role);
				}
				else {System.out.println("Exit UserDataService.findByUsername() with false");};
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return user;
		}

		//creates new user
		@Override
		public boolean create(User user) {
			//output statement for console
			System.out.println("Entering UserDataService.create()");
			String sql = "INSERT INTO user(firstName, lastName, username, email, phoneNumber, password, role) VALUES(?, ?, ?, ?, ?, ?, ?)";

			try {
				//output statement for console
				System.out.println("Entering UserDataService.create() with true");
				//execute sql statement
				int rows = jdbcTemplateObject.update(sql, user.getFirstName(), user.getLastName(), user.getUsername(), user.getEmail(), user.getPhoneNumber(), user.getPassword(), user.getRole());
				//return result
				return rows == 1 ? true : false;
			}
			
			catch (Exception e) {
				//output statement for console
				System.out.println("Exiting UserDataService.create() with false");
				e.printStackTrace();
			}
			return true;
		}

		//updates user
		@Override
		public boolean update(User t) {
			// TODO Auto-generated method stub
			return false;
		}

		//deletes user
		@Override
		public boolean delete(User t) {
			// TODO Auto-generated method stub
			return false;
		}
		
		//IoC helper function
		//Spring Data Source to inject into DAO
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
			this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		}
}
