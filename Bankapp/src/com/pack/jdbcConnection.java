package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcConnection {

	public jdbcConnection() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}
