package com.avi.StudentMgt;

import org.hibernate.Session;

import com.avi.util.SessionProvider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionProvider sp=new SessionProvider();
        		Session s=sp.getSessionObject();
        		System.out.println(s.isOpen());
;    }
}
