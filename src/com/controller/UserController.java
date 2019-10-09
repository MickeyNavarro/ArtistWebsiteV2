//Almicke Navarro and Emily Quevedo
//CST-341
//September 16, 2019 
//This is our own work.

//CONTROLLER 
//this is the user controller; this will deal with any CRUD operations for the model object of user
package com.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.model.Credentials;

@Controller 
@RequestMapping("/user")
public class UserController {
	//home page 
		@RequestMapping(path="/home", method=RequestMethod.GET)
		public ModelAndView displayHomePage() { 
			return new ModelAndView("homePage", "user", new User("","","","","",""));
			}
	
	//registration mechanisms
		@RequestMapping(path="/register", method = RequestMethod.GET) 
		public ModelAndView displayRegistrationPage() { 
			return new ModelAndView("registrationPage", "user", new User("","","","","",""));
			}
		  
		@RequestMapping(path="/registerSuccess", method = RequestMethod.POST)
		public ModelAndView registerUser(@Valid @ModelAttribute("user") User user, BindingResult result) { 
			//validate the form 
			if(result.hasErrors()) { 
				//return to registration form to show registration errors
				return new ModelAndView("registrationPage", "user", user); 
			}
			
			//return to the login page to show that registration was successful
			return new ModelAndView("loginPage", "user", user); 
		}
		
	//login mechanisms
		@RequestMapping(path="/login", method = RequestMethod.GET) 
		public ModelAndView displayLoginPage() { 
			return new ModelAndView("loginPage", "user", new Credentials("", ""));
			}
		  
		@RequestMapping(path="/loginSuccess", method = RequestMethod.POST)
		public ModelAndView loginUser(@Valid @ModelAttribute("user") Credentials user, BindingResult result) { 
			//validate the form 
			if(result.hasErrors()) { 
				//return to login form to show login errors
				return new ModelAndView("loginPage", "user", user); 
			}
			
			//return to the home page to show that login was successful
			return new ModelAndView("homePage", "users", user); 
		}
	
	
}
