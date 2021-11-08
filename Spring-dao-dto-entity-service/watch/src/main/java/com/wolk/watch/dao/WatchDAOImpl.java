package com.wolk.watch.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolk.watch.entity.WatchEntity;

public class WatchDAOImpl implements WatchDAO {
	SessionFactory factory=null;
	Session session=null;
	int rows=0;
	public int saveData(WatchEntity entity) {
		System.out.println(session);
		try {
			factory=(SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			rows=1;
		} finally {
			if(session!=null) {
				session.close();
			}
		}
		return rows;	
	}
}