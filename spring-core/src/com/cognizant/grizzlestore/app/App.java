package com.cognizant.grizzlestore.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.grizzlestore.model.LoginDetails;
import com.cognizant.grizzlestore.model.ProductBrand;
import com.cognizant.grizzlestore.model.ProductCategory;
import com.cognizant.grizzlestore.model.ProductDetails;
import com.cognizant.grizzlestore.service.GrizzleService;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
		GrizzleService service=(GrizzleService)container.getBean("grizzleService");
		System.out.println(service);
		LoginDetails details=container.getBean("loginDetails",LoginDetails.class);
		System.out.println(details);
		try
		{
			int flag=service.checkUserDetails(details);
			System.out.println(flag);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ProductBrand brand=container.getBean("brand",ProductBrand.class);
		System.out.println(brand);
		ProductCategory category=container.getBean("Category",ProductCategory.class);
		System.out.println(category);
		ProductDetails productdetails=container.getBean("productDetails",ProductDetails.class);
		System.out.println(productdetails);
		ProductDetails productdetails1=container.getBean("productDetails1",ProductDetails.class);
		System.out.println(productdetails1);
	}

}
