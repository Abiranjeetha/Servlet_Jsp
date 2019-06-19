package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/FirstServlet") either configure in web.xml or this line
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
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
		pw.println("Inside get method");
		String s1=request.getParameter("n1");
		int id=Integer.parseInt(s1);
		pw.println(id+"<br/>");
		String s2=request.getParameter("n2");
		pw.println(s2+"<br/>");
		String s3=request.getParameter("n3");
		float sal=Float.parseFloat(s3);
		pw.println(sal+"<br/>");
		String s4=request.getParameter("n4");
		pw.println(s4+"<br/>");
		String hobby[]=request.getParameterValues("n5");
		for(String hob:hobby)
			pw.println(hob+"<br/>");
		
		pw.println(request.getScheme()+"<br/>");
		pw.println(request.getProtocol()+"<br/>");
		pw.println(request.getServerName()+"<br/>");
		pw.println(request.getServerPort()+"<br/>");
		pw.println(request.getContextPath()+"<br/>");
		pw.println(request.getServletPath()+"<br/>");
		pw.println(request.getRequestURI()+"<br/>");
		pw.println(request.getQueryString()+"<br/>");
		
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements())
		{
			String s5=(String)e.nextElement();
			String s6=request.getParameter(s5);
			pw.println(s5 +" = "+s6+" = "+"<br/>");
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("Inside post method");
		String s1=request.getParameter("n1");
		int id=Integer.parseInt(s1);
		pw.println(id+"<br/>");
		String s2=request.getParameter("n2");
		pw.println(s2+"<br/>");
		String s3=request.getParameter("n3");
		float sal=Float.parseFloat(s3);
		pw.println(sal+"<br/>");
		String s4=request.getParameter("n4");
		pw.println(s4+"<br/>");
		String hobby[]=request.getParameterValues("n5");
		for(String hob:hobby)
			pw.println(hob+"<br/>");
		
		pw.println(request.getScheme()+"<br/>");
		pw.println(request.getProtocol()+"<br/>");
		pw.println(request.getServerName()+"<br/>");
		pw.println(request.getServerPort()+"<br/>");
		pw.println(request.getContextPath()+"<br/>");
		pw.println(request.getServletPath()+"<br/>");
		pw.println(request.getRequestURI()+"<br/>");
		pw.println(request.getQueryString()+"<br/>");
		
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements())
		{
			String s5=(String)e.nextElement();
			String s6=request.getParameter(s5);
			pw.println(s5 +" = "+s6+" = "+"<br/>");
		}	

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("Inside service method");
		String s=request.getMethod();
		if(s.equals("POST"))
			doPost(request,response);
		else
			doGet(request,response);
		
	}
}
