package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SeventhServlet
 */
@WebServlet(
		urlPatterns = { "/SeventhServlet" }, 
		initParams = { 
				@WebInitParam(name = "fname", value = "Abi"), 
				@WebInitParam(name = "lname", value = "ranjeetha")
		})
public class SeventhServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeventhServlet() {
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
		ServletConfig sc=getServletConfig();
		String s1=sc.getInitParameter("fname");
		pw.println(s1+"<br/>");
		String s2=sc.getInitParameter("salary");
		pw.println(s2+"<br/>");
		Enumeration e=sc.getInitParameterNames();
		while(e.hasMoreElements())
		{
			String s3=(String)e.nextElement();
			String s4=sc.getInitParameter(s3);
			pw.println(s3+" = "+s4+"<br/>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
