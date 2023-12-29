package com.insurance.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.insurance.dao.CategoryDAO;
import com.insurance.pojo.Category;

public class CategoryDAIOImpl implements CategoryDAO {
	
	List<Category> addCategory = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addCategory() {
		int k = 1;
		while (k == 1) {
		// TODO Auto-generated method stub
		System.out.println("Enter Category ID");
		int id = sc.nextInt();
		System.out.println("Enter Category Name");
		String cname = sc.next();
		
		Category category = new Category(id,cname);
		addCategory.add(category);
		
		System.out.println("Category added Successfully");
		System.out.println("Do you want to add another Category? 1)Yes  2)NO");
		k = sc.nextInt();
	}// end of k

	}

}
