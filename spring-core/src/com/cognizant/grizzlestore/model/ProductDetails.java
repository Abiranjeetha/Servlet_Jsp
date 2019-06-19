package com.cognizant.grizzlestore.model;

public class ProductDetails {
	private int productID;
	private String productName;
	private String productDescription;
	private float productPrice;
	
	ProductBrand productBrand;
	ProductCategory productcategory;
	public ProductDetails(int productID, String productName, String productDescription, float productPrice,
			ProductBrand productBrand, ProductCategory productcategory) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productcategory = productcategory;
	}
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public ProductBrand getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(ProductBrand productBrand) {
		this.productBrand = productBrand;
	}
	public ProductCategory getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(ProductCategory productcategory) {
		this.productcategory = productcategory;
	}
	@Override
	public String toString() {
		return "ProductDetails [productID=" + productID + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productBrand=" + productBrand
				+ ", productcategory=" + productcategory + "]";
	}
	

}
