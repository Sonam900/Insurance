package com.insurance.dao;

import java.util.List;

import com.insurance.pojo.User;

public interface UserDAO {

	public void addUser();
	
	String verifyUnameandPass(String uname, String pass);     

	String forgotPassword(String email);

	public static List<User>viewAllUsers() {
		
		return null;
	}
}



