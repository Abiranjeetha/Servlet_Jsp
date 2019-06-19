package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EigthServlet
 */
//@WebServlet("/EigthServlet")
public class EigthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EigthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		ServletContext sc=getServletContext();
		String s1=sc.getInitParameter("mark1");
		pw.println(s1+"<br/>");
		String s2=sc.getInitParameter("mark2");
		pw.println(s2+"<br/>");
		Enumeration e=sc.getInitParameterNames();
		while(e.hasMoreElements())
		{
			String s3=(String)e.nextElement();
			String s4=sc.getInitParameter(s3);
			pw.println(s3+" = "+s4+"<br/>");
		}
		sc.setAttribute("mark3", 85);
		pw.println("<a href='/FSD/NinethServlet'>Click here</a>");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
