package com.pack;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
//import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ExampleListener1
 *
 */
//@WebListener
public class ExampleListener1 implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ExampleListener1() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	ServletContext sc=arg0.getServletContext();
    	String s=sc.getInitParameter("state");
    	sc.setAttribute("state1", s);
    }
	
}
