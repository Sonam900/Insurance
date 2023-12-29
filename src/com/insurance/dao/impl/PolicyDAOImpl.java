package com.insurance.dao.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.insurance.dao.PolicyDAO;
import com.insurance.pojo.Policy;


public class PolicyDAOImpl implements PolicyDAO {
List<Policy> addPolicy = new ArrayList<>();
List<Policy> requestPolicy = new ArrayList<>();
List<Policy> editPolicy = new ArrayList<>();
Scanner sc = new Scanner(System.in);

	@Override
	public void addPolicy() {
		int k = 1;
		while (k == 1) {
		// TODO Auto-generated method stub
		System.out.println("Enter Policy ID");
		int id = sc.nextInt();
		System.out.println("Enter Policy Name");
		String pname = sc.next();
		System.out.println("Enter Start Date");
		long sdate = sc.nextLong();
		System.out.println("Enter End Date");
		long edate = sc.nextLong();
		System.out.println("Enter Category");
		String cat = sc.next();
		System.out.println("Enter Sub Category");
		String scat = sc.next();
		
		Policy policy = new Policy(id,pname,sdate,edate,cat,scat);
		addPolicy.add(policy);
		
		System.out.println("Policy added Successfully!");
		System.out.println("Do you want to add another policy? 1)Yes  2)NO");
		k = sc.nextInt();
	} // while loop of k

	}

	@Override
	public void editPolicy() {
		
	}
	

	@Override
	public void requestPolicy() {
		System.out.println("Enter Policy Holder Name");
		String policyName = sc.next();
		System.out.println("Enter Start Date");
		long sdate = sc.nextLong();
		System.out.println("Enter End Date");
		long edate = sc.nextLong();
		
		Policy policy = new Policy(policyName,sdate,edate);
		requestPolicy.add(policy);
		System.out.println("Policy has been requested Successfully. Approval decision will be notified to you.");
	}
	
	@Override
	public void userPolicy() {
		// TODO Auto-generated method stub
		System.out.println("This is the list of your policies: " );
	}

	@Override
	public List<Policy> viewAllPolicy() {
		// TODO Auto-generated method stub
		return null;
		
	}


}

