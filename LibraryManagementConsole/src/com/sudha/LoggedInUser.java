package com.sudha;

import com.sudha.Library.LoginStatus;

public class LoggedInUser {
	
	private User user;
	private LoginStatus loginStatus;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LoginStatus getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(LoginStatus loginStatus) {
		this.loginStatus = loginStatus;
		
	}
	
	// How to use login method in main method.
	// why did we created LoggedIn class...what problem does it solve? 
	// by calling subscription method how system understands that it is same id by which customer logged in ...because to recognize the same login id,it's not even using 
	//loggedInUser class.
	//why did we comment out else part in search method
	//role class needs to be used.
	//What can we access private method.
	//pls explain edit book method flow.
}