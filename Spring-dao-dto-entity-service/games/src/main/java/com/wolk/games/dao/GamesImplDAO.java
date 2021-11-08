package com.wolk.games.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolk.games.entity.GamesEntity;

public class GamesImplDAO implements GamesDAO {

	public int save(GamesEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=(SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
		} finally {
			session.close();
		}
		return 1;
	}

}