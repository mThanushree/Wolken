package com.wolk.butterfly;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wolk.butterfly.Entity.ButterflyDetails;

public class Tester {
	public static void main(String []args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		ButterflyDetails details = (ButterflyDetails)s.get(ButterflyDetails.class,"pie");
		System.out.println(details);
		s.close();
		f.close();
	}
	

}
