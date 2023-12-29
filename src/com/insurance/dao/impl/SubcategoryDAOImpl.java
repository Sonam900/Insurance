package com.insurance.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.insurance.dao.SubCategoryDAO;
import com.insurance.pojo.Subcategory;

public class SubcategoryDAOImpl implements SubCategoryDAO {
	List<Subcategory> addSubCategory = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addSubcategory() {
		// TODO Auto-generated method stub
				int k = 1;
				while (k == 1) {
				// TODO Auto-generated method stub
				System.out.println("Enter Sub Category ID");
				int id = sc.nextInt();
				System.out.println("Enter Sub Category Name");
				String cname = sc.next();
				
				Subcategory subcategory = new Subcategory(id,cname);
				Subcategory.add(subcategory);
				
				System.out.println("Category added Successfully");
				System.out.println("Do you want to add another Category? 1)Yes  2)NO");
				k = sc.nextInt();
			}// end of k
			}

}
