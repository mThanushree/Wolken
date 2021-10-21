package com.wolk.Planet.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory factory;
	
	private HibernateUtils() {
		
	}
	
	public static SessionFactory getInstance() {
		if(factory == null) {
			Configuration c = new Configuration();
			c.configure();
			factory = c.buildSessionFactory();
		}
		return factory;
	}

}
