package com.avi.StudentMgt;

import org.hibernate.Session;

import com.avi.dao.InsertData;
import com.avi.util.SessionProvider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )//throws Exception
    {
    	try {
        InsertData id=new InsertData(); 
        id.insertData();
    	}catch(Exception p) {
    		System.out.println(p.toString());
    	}
    }
}
