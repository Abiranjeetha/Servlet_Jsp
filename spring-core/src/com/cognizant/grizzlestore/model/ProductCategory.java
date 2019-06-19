package com.cognizant.grizzlestore.model;

public class ProductCategory {
	private int categoryID;
	private String categoryName;
	public ProductCategory(int categoryID, String categoryName) {
		super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}
	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "ProductCategory [categoryID=" + categoryID + ", categoryName=" + categoryName + "]";
	}
	

}
