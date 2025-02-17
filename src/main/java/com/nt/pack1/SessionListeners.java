package com.nt.pack1;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
//@WebListener
public class SessionListeners implements HttpSessionListener,HttpSessionAttributeListener
{
	@Override
	public void sessionCreated(HttpSessionEvent hse) 
	{
		System.out.println("SessionListeners.sessionCreated()");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent hse) {
		System.out.println("SessionListeners.sessionDestroyed()");
	}
	@Override
	public void attributeAdded(HttpSessionBindingEvent hsbe)
	{
		System.out.println("SessionListeners.attributeAdded()");
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent hsbe)
	{
		System.out.println("SessionListeners.attributeRemoved()");
	}
}
