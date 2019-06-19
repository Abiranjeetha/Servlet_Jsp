package com.pack;

import javax.servlet.http.HttpSession;
//import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class ExampleListener3
 *
 */
//@WebListener
public class ExampleListener3 implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public ExampleListener3() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	HttpSession hs=arg0.getSession();
    	System.out.println("Attribute added "+hs+" "+arg0.getName()+" "+arg0.getValue());
    	
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	HttpSession hs=arg0.getSession();
    	System.out.println("Attribute removed "+hs+" "+arg0.getName()+" "+arg0.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	HttpSession hs=arg0.getSession();
    	System.out.println("Attribute replaced "+hs+" "+arg0.getName()+" "+arg0.getValue());
    }
	
}
