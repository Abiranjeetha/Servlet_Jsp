package com.cognizant.grizzlestore.service;

import java.util.List;

import com.cognizant.grizzlestore.exception.GrizzleException;
import com.cognizant.grizzlestore.model.LoginDetails;
import com.cognizant.grizzlestore.model.ProductDetails;

public interface IGrizzleStore {
	public int checkUserDetails(LoginDetails logindetails)throws GrizzleException;
	public int saveProduct(ProductDetails productDetails)throws GrizzleException;
	public List<ProductDetails>getProductDetails()throws GrizzleException;
}
