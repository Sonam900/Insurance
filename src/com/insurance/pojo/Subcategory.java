package com.insurance.pojo;

public class Subcategory {

	private int subcategoryId;
    private String subcategoryName;
    private Category category;
    
    
	public int getSubcategoryId() {
		return subcategoryId;
	}
	public void setSubcategoryId(int subcategoryId) {
		this.subcategoryId = subcategoryId;
	}
	public String getSubcategoryName() {
		return subcategoryName;
	}
	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Subcategory(int subcategoryId, String subcategoryName) {
		super();
		this.subcategoryId = subcategoryId;
		this.subcategoryName = subcategoryName;
		
	}
	public Subcategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void add(Subcategory subcategory) {
		// TODO Auto-generated method stub
		
	}
	
	
    
}
