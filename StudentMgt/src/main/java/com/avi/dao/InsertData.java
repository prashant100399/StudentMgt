package com.avi.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.avi.model.Student;
import com.avi.util.SessionProvider;

public class InsertData {
	
	private Session session;
	private Transaction transaction;
	private SessionProvider sessionprovider;
	private Student student;
	private BufferedReader br;
	private String name;
	private String address;
	
	public InsertData() {
		System.out.println("==========Enter into InsertData no-args constructor========");
		sessionprovider=new SessionProvider();
		br=new BufferedReader(new InputStreamReader(System.in));
		student=new Student();
		System.out.println("==========Exit from InsertData no-args constructor========");
		
	}
	
	private void getDatafromUser() throws Exception{
		System.out.println("==========Enter into getDatafromUser()========  \n \n \n ");
		System.out.println("Enter your name:");
		name=br.readLine();
		student.setName(name);
		System.out.println("enter your address:");
		address=br.readLine();
		student.setAddress(address);
		System.out.println("==========Exit from getDatafromUser()========");
		
	}
	
	public void insertData() {
		try{
		getDatafromUser();
		session=sessionprovider.getSessionObject();
		transaction=session.beginTransaction();
		System.out.println("===============Succesfullly get Session And Transaction Object===========");
		session.saveOrUpdate(student);
		System.out.println("===============Successfully insert record===========");
		transaction.commit();
		System.out.println("===============successfully commited===========");
		}catch(Exception e) {
			transaction.rollback();
		}finally {
			
			sessionprovider.closeSession();
			sessionprovider.closeSessionFactory();
		}
		
		
	}
	
	
	
	
	
	
	

}
