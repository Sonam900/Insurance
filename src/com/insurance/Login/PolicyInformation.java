package com.insurance.Login;

import java.util.List;
import java.util.Scanner;

import com.insurance.dao.UserDAO;
import com.insurance.dao.impl.CategoryDAIOImpl;
import com.insurance.dao.impl.PolicyDAOImpl;
import com.insurance.dao.impl.SubcategoryDAOImpl;
import com.insurance.pojo.User;

public class PolicyInformation {

		Scanner sc = new Scanner(System.in);
		PolicyDAOImpl policydaoImpl = new PolicyDAOImpl();
		CategoryDAIOImpl categorydaoImpl = new CategoryDAIOImpl();
		SubcategoryDAOImpl subcategoryDAOImpl = new SubcategoryDAOImpl();
		
		public void adminMenu()
		{
			while (true) {
		
		System.out.println("     Admin Dashboard	");
		System.out.println("==================================");
		System.out.println("	  1)Add Policy			");
		System.out.println("	  2)Add Category			");
		System.out.println("	  3)Add Subcategory		");
		System.out.println("	  4)Policy Request		");
		System.out.println("	  5)Edit Policy			");
		System.out.println("	  6)View All User 			");
		System.out.println("	  7)LogOut			");
		System.out.println("==================================");

		System.out.println("Enter the choice");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:

			policydaoImpl.addPolicy();
			break;
		case 2:

			categorydaoImpl.addCategory();
			break;
		case 3:

			subcategoryDAOImpl.addSubcategory();
			break;
		case 4:

			policydaoImpl.requestPolicy();
			break;
		case 5:

			policydaoImpl.editPolicy();
			break;
		case 6:
			
			List<User> viewAllUser = UserDAO.viewAllUsers();
			if (viewAllUser !=null) {
				
			for (User u : viewAllUser)
			{
				System.out.println(u.getUid()+"\t"+u.getFirstName()+"\t"+u.getLastName()+"\t"+u.getUserName());
			}
			}
			else;
			System.out.println("There is not any user registered in the system yet. Please add user to view users.");
			break;
			
		case 7:
			System.out.println("Thank for using the app!");
			System.exit(0);
			
		default:
			System.out.println("Please choose between 1 to 6.");
		}//switch closed
		}// while closed
		}//admin. menu closed
	
		public void CustomerMenu() {
		    boolean exit = false;

		    while (!exit) {
		        System.out.println("     Customer Dashboard	");
		        System.out.println("-------------------------");
		        System.out.println("	1) View Category	");
		        System.out.println("	2) View SubCategory 	");
		        System.out.println("	3) Apply Insurance        ");
		        System.out.println("	4) Your Product         ");
		        System.out.println("	5) LogOut			");
		        System.out.println("-------------------------");

		        System.out.println("Enter the choice");
		        int choice = sc.nextInt();

		        switch (choice) {
		            case 1:
		                categoryMenu();
		                break;
		            case 2:
		                SubcategoryMenu();
		                break;
		            case 3:
		            	applyInsurance();		               
		            	break;
		            case 4:
		                System.out.println("These are the list of policy that you have purchased.");
		                // Implement logic for displaying purchased items
		                break;
		            case 5:
		                exit = true;
		                System.out.println("Thanks for using the app!!!");
		                break;
		            default:
		                System.out.println("Please choose the option between 1 to 5.");
		        
				}//switch choice
		    }// while loop
			}//Customer menu
		


		public void applyInsurance() {
			categoryMenu();
			SubcategoryMenu();
			
		}

		public void categoryMenu() {

			System.out.println("-----------------------------------------");
			System.out.println("Which category would you like to choose?");
			System.out.println("	1)ViewHomeInsurance	");
			System.out.println("	2)ViewCarInsurance 		");
			System.out.println("	3)Return Back		");
			System.out.println("-----------------------------------------");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				
				System.out.println("You selected Home Insurance.");
				break;
			case 2:
				
				System.out.println("You selected Car Insurane.");
				break;
			case 3:
				System.out.println("Returning to Customer Menu.");
				CustomerMenu();
				break;
			default:
				System.out.println(" Choose between 1 to 3.");
			
			}
		}
			
				public void SubcategoryMenu() {

					System.out.println("-----------------------------------------");
					System.out.println("Which Subcategory would you like to choose?");
					System.out.println("	1) 6 months	plan	");
					System.out.println("	2) 1 year plan 		");
					System.out.println("	3) Return Back		");
					System.out.println("-----------------------------------------");
					System.out.println("Enter the choice");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						
						 System.out.println("You selected 6 months plan.");
						 System.out.println("Features of the 6 months insurance plan:");
					     System.out.println("   -> Coverage for a duration of 6 months.");
					     System.out.println("   -> Premium benefits, including emergency coverage.");
					     System.out.println("   -> Flexible payment options.");
						break;
					case 2:
						
						 System.out.println("You selected One year plan.");
						 System.out.println("Features of the 1 year insurance plan:");
					        System.out.println("   -> Comprehensive coverage for a full year.");
					        System.out.println("   -> Added benefits such as travel insurance and liability coverage.");
					        System.out.println("   -> Discounted annual premium for long-term protection.");
						break;
					case 3:
						System.out.println("Returning to Category Menu.");
						categoryMenu();
						break;
					default:
						System.out.println("Please choose between 1 to 3.");
					
			}
		}
		}
		
