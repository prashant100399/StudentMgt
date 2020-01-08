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
		System.out.println("===============Enter into SessionProvider Constructor===========");
		sessionfactory=new Configuration().configure().buildSessionFactory();
		session=sessionfactory.openSession();
		System.out.println("===============Exit SessionProvider Constructor===========");			
	}
	
	public Session getSessionObject() {
		System.out.println("===============going into getSessionObject()===========");
		return session;
		
	}
	
	

}
