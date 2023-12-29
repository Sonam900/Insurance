package com.insurance.dao;

import java.util.List;

import com.insurance.pojo.Policy;

public interface PolicyDAO {

	public void addPolicy();
	
	public void editPolicy();
	
	public void requestPolicy();
	
	public void userPolicy();
	
	public List<Policy>viewAllPolicy();


	
	
	
}
