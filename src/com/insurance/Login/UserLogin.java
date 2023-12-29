package com.insurance.Login;

import java.util.Scanner;

import com.insurance.dao.impl.UserDAOImpl;

public class UserLogin {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UserDAOImpl daoImpl = new UserDAOImpl();
		PolicyInformation details = new PolicyInformation();
		
		while (true) {
			System.out.println("	LOGIN 	");
			System.out.println("=========================");
			System.out.println("	  1)Register			");
			System.out.println("	  2)Login			");
			System.out.println("	  3)Forget Password			");
			System.out.println("	  4)Exit			");
			System.out.println("=========================");

			System.out.println("Enter the choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			
			case 1:
				daoImpl.addUser(); 
				
				break;
				
			case 2:
				System.out.println("Enter User name: ");
				String uname = sc.next();
				System.out.println("Enter password:");
				String pass = sc.next();

				String msg = daoImpl.verifyUnameandPass(uname, pass);
				
				if (msg != null) {
					if (msg.equals("admin")) {
						details.adminMenu();
					} else {
						details.CustomerMenu();
					}
				} // end of id with message null
				else {
					System.out.println("Invalid User.");
				}
				break;
			case 3:
				System.out.println("Enter Email associated with password.");
				String email = sc.next();
				String password = daoImpl.forgotPassword(email);
				if (password != null)
					System.out.println("Password : " + password);
				else
					System.out.println("Email doesnot exist.");
				break;
			case 4:
				System.out.println("Thanks for using app!!!");
				System.exit(0);
				
			default:
				
				System.out.println(" Choose between 1 to 4.");

			}// while loop ends
		}

	}
}