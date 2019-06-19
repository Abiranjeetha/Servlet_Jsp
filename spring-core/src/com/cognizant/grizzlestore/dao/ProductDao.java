package com.cognizant.grizzlestore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.grizzlestore.exception.GrizzleException;
import com.cognizant.grizzlestore.model.ProductBrand;
import com.cognizant.grizzlestore.model.ProductCategory;
import com.cognizant.grizzlestore.model.ProductDetails;
import com.cognizant.grizzlestore.util.ConnectionUtil;

public class ProductDao {

	private static ProductDao productDao;
	private ProductDao() {
		// TODO Auto-generated constructor stub
	}
	public static ProductDao getProductDao()
	{
		if(productDao==null)
		{
			productDao=new ProductDao();
		}
		return productDao;
	}
	public int saveProduct(ProductDetails productDetails)throws GrizzleException
	{
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement preparedstatement=null;
		int count=0;
		try
		{
		preparedstatement=connection.prepareStatement("insert into product(p_id,p_name,p_description,p_price,pr_br_fk,pr_cr_fk) values(?,?,?,?,?)");
		preparedstatement.setInt(1, productDetails.getProductID());
		preparedstatement.setString(2, productDetails.getProductName() );
		preparedstatement.setString(3, productDetails.getProductDescription());
		preparedstatement.setFloat(4, productDetails.getProductPrice());
		preparedstatement.setInt(5, productDetails.getProductBrand().getBrandId());
		preparedstatement.setInt(6, productDetails.getProductcategory().getCategoryID());
		count=preparedstatement.executeUpdate();
		if(count>0)
		{
			System.out.println("save");
		}
		else
		{
			System.out.println("not save");
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new GrizzleException(e.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new GrizzleException(e.getMessage());
		}
		finally {
			try
			{
				if(preparedstatement!=null) {
					preparedstatement.close();
				}
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new GrizzleException(e.getMessage());
			}
		}
		return count;
	}
	public List<ProductDetails>getProductDetails()throws GrizzleException
	{
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement preparedstatement=null;
		List<ProductDetails>list=new ArrayList<>();
		ResultSet resultset=null;
		try
		{
			preparedstatement=connection.prepareStatement("select p.*,c.*,b.*  from product p join product_category c join  product_brand b on p.pr_br_fk=b.b_id and c.c_id=pr_cr_fk");
			resultset=preparedstatement.executeQuery();
			while(resultset.next())
			{
				int productId=resultset.getInt("p_id");
				String productName=resultset.getString("p_name");
				String productDescription=resultset.getString("p_description");
				float price=resultset.getFloat("p_price");
				
				int categoryId=resultset.getInt("c_id");
				String categoryName=resultset.getString("c_name");
				ProductCategory productcategory=new ProductCategory(categoryId,categoryName);
				
				int brandId=resultset.getInt("b_id");
				String brandName=resultset.getString("b_name");
				ProductBrand productbrand=new ProductBrand(brandId,brandName);
				
				ProductDetails productdetails=new ProductDetails(productId,productName,productDescription,price,productbrand,productcategory);
				list.add(productdetails);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new GrizzleException(e.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new GrizzleException(e.getMessage());
		}
		finally {
			try
			{
				if(resultset!=null)
				{
					resultset.close();
				}
				if(preparedstatement!=null) {
					preparedstatement.close();
				}
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch(SQLException e){
				e.printStackTrace();
				throw new GrizzleException(e.getMessage());
			}
		}
		return list;
		
	}
	

}
