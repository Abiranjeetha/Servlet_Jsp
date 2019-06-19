package com.pack;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ExampleListener2
 *
 */
@WebListener
public class ExampleListener2 implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public ExampleListener2() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	HttpSession hs=arg0.getSession();
    	System.out.println("Session created");
    	hs.setAttribute("dog", "labrado");
    	hs.setAttribute("name", "tinku");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	HttpSession hs=arg0.getSession();
    	System.out.println("Session destroyed");
    	System.out.println(hs.getAttribute("dog"));
    	System.out.println(hs.getAttribute("name"));
    }
	
}
