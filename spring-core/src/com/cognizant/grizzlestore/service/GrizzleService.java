package com.cognizant.grizzlestore.service;

import java.util.List;

import com.cognizant.grizzlestore.dao.LoginDao;
import com.cognizant.grizzlestore.dao.ProductDao;
import com.cognizant.grizzlestore.exception.GrizzleException;
import com.cognizant.grizzlestore.model.LoginDetails;
import com.cognizant.grizzlestore.model.ProductDetails;

public class GrizzleService implements IGrizzleStore {

	public GrizzleService() {
		// TODO Auto-generated constructor stub
	}
	public void init()
	{
		System.out.println("init in service");
	}
	public void destroy()
	{
		System.out.println("Destroy in service");
	}
	
	LoginDao loginDao=LoginDao.getLoginDao();
	ProductDao productDao=ProductDao.getProductDao();

	@Override
	public int checkUserDetails(LoginDetails logindetails) throws GrizzleException {
		// TODO Auto-generated method stub
		return loginDao.checkUserDetails(logindetails);
	}

	@Override
	public int saveProduct(ProductDetails productDetails) throws GrizzleException {
		// TODO Auto-generated method stub
		return productDao.saveProduct(productDetails);
	}

	@Override
	public List<ProductDetails> getProductDetails() throws GrizzleException {
		// TODO Auto-generated method stub
		return productDao.getProductDetails();
	}

}
