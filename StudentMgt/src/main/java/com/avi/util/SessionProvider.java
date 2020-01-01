package com.avi.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class SessionProvider {
	private Configuration cfg;
	private SessionFactory sessionfactory;
	private Session session;
	private Transaction transaction;
	
	public SessionProvider() {
		sessionfactory=new Configuration().configure().buildSessionFactory();
		//sessionfactory=new Configuration().configure().buildSessionFactory();
		session=sessionfactory.openSession();
					
	}
	
	public Session getSessionObject() {
		return session;
	}
	
	

}
