package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.text.*;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class EighteenServlet
 */

public class EighteenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EighteenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String s=request.getParameter("salary");
		float sal=Float.parseFloat(s);
		String address=request.getParameter("addr");
		String dob=request.getParameter("dob");
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		Date d=null;
		try
		{
			d=sd.parse(dob);
		}
		catch(ParseException e)
		{
			pw.println(e);
		}
		Random r=new Random();
		int id=r.nextInt(900000)+100000;
		
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setFloat(3, sal);
			ps.setString(4, address);
			java.sql.Date d1=new java.sql.Date(d.getTime());
			ps.setDate(5, d1);
			int i=ps.executeUpdate();
			if(i==1)
			{
				RequestDispatcher rd=request.getRequestDispatcher("/success.html");
				rd.forward(request, response);
			}
		}
		catch(Exception e)
		{
			pw.println(e);
		}
		finally
		{
			try
			{
				if(con!=null)
				{
					con.close();
				}
			}
			catch(Exception e)
			{
				pw.println(e);
			}
		}
		
	}

}
