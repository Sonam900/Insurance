package com.insurance.pojo;

public class Policy {

	private int policyId;
	private String policyName;
	private long startDate;
	private long endDate;
	private String category;
	private String subcategory;
	
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public long getStartDate() {
		return startDate;
	}
	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}
	public long getEndDate() {
		return endDate;
	}
	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	
	
	public Policy(int policyId, String policyName, long startDate, long endDate, String cat,
			String scat) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.category = cat;
		this.subcategory = scat;
	}
	
	
	public Policy(String policyName2, long sdate, long edate) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
