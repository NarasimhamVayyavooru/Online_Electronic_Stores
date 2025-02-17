package com.nt.pack1;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
//@WebListener
public class RequestListener implements ServletRequestListener,ServletRequestAttributeListener
{
	
	public void requestInitilized(ServletRequestEvent sre) 
	{
		System.out.println("RequestListener.requestInitilized()");
	}
	@Override
	public void requestDestroyed(ServletRequestEvent sre) 
	{
		System.out.println("RequestListener.requestDestroyed()");
	}
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) 
	{
		System.out.println("RequestListener.attributeAdded()");
		System.out.println("==> "+srae.getName());
	}
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("RequestListener.attributeRemoved()");
		
	}

}
