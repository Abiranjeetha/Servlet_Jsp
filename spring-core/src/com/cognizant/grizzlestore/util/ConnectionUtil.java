package com.cognizant.grizzlestore.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cognizant.grizzlestore.exception.GrizzleException;

public class ConnectionUtil {

	public ConnectionUtil() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection() throws GrizzleException
	{
		Connection connection=null;
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver");
		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/pstore","root","root");
		}
		catch(ClassNotFoundException e)
		{
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

}
