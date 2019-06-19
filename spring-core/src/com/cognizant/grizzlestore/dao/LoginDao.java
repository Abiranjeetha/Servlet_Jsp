package com.cognizant.grizzlestore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.grizzlestore.exception.GrizzleException;
import com.cognizant.grizzlestore.model.LoginDetails;
import com.cognizant.grizzlestore.util.ConnectionUtil;

public class LoginDao {
	
	
	private static LoginDao loginDao;
	private LoginDao() {
		// TODO Auto-generated constructor stub
	}
	
	public static LoginDao getLoginDao()
	{
		if(loginDao==null)
		{
			loginDao=new LoginDao();
		}
		return loginDao;
	}
	public int checkUserDetails(LoginDetails logindetails)throws GrizzleException
	{
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement preparedstatement=null;
		ResultSet resultset=null;
		int flag=0;
		try
		{
			preparedstatement=connection.prepareStatement("select username,password  from Login where username=? and password=?");
			preparedstatement.setString(1, logindetails.getUsername());
			preparedstatement.setString(2, logindetails.getPassword());
			resultset=preparedstatement.executeQuery();
			if(resultset.next())
			{
				flag=1;
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
		return flag;
		
	}
	

}
