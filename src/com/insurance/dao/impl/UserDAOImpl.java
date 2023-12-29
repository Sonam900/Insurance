package com.insurance.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.insurance.dao.UserDAO;
import com.insurance.pojo.User;

public class UserDAOImpl implements UserDAO {
	List<User> addUser = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addUser() {

		int k = 1;
		
		User users = new User();
		users.setUid(1);
		users.setEmail("admin@gmail.com");
		users.setPassword("admin");
		users.setRoleName("admin");
		users.setUserName("admin");
		addUser.add(users);
		
		while (k == 1) {
			System.out.println("Enter User ID");
			int id = sc.nextInt();
			System.out.println("Enter First Name");
			String fname = sc.next();
			System.out.println("Enter Last Name");
			String lname = sc.next();
			System.out.println("Enter Phone Number");
			long phone = sc.nextLong();
			System.out.println("Enter Email");
			String email = sc.next();
			System.out.println("Enter User Name");
			String uname = sc.next();
			System.out.println("Enter Password");
			String pass = sc.next();

			User user = new User(id, fname, lname, phone, email, uname, pass);
			user.setRoleName("Customer");
			
			addUser.add(user);
			System.out.println("Registration Successful !!!");
			System.out.println("Please Login to Continue.");
	
			k = sc.nextInt();
		} // while loop of k
	}

	@Override
	public String verifyUnameandPass(String uname, String pass) {
		// TODO Auto-generated method stub

		String msg = "";
		for (User user : addUser) {
			if (user.getUserName().equals(uname) && user.getPassword().equals(pass)) {
				msg = user.getRoleName();
				break;
			}
		}

		return msg;

	
	}

	@Override
	public String forgotPassword(String email) {
		// TODO Auto-generated method stub

		for (User user : addUser) {
			if (user.getEmail().equals(email)) {
				return user.getPassword();
			}
		}

		return null;
	}

	
	public List<User> viewAllUsers() {
		// TODO Auto-generated method stub
		return addUser;
	}

}
