package com.wolk.meesho.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolk.meesho.entity.LoginEntity;
import com.wolk.meesho.entity.UserEntity;

public class RegistrationImplDAO implements RegistrationDAO {

	public int save(UserEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		int rows=0;
		try {
			factory=(SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			rows=1;
		}finally {
			session.close();
		}
		return rows;
	}

	public LoginEntity getByEmail(String email) {
		Session session=null;
		SessionFactory factory=null;
		LoginEntity entity=null;
		try {
			factory=(SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
			session=factory.openSession();
			@SuppressWarnings("unchecked")
			Query<LoginEntity> query=session.createNamedQuery("getbyemail");
			query.setParameter("email", email);
			entity=(LoginEntity) query.uniqueResult();
		} finally {
			session.close();
		}
		return entity;
	}

	public int forgotPassword(LoginEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		int rows=0;
		try {
			factory=(SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			
			Query<LoginEntity> query=session.createNamedQuery("updatePassword");
			query.setParameter("password", entity.getPassword());
			query.setParameter("email", entity.getEmail());
			rows=query.executeUpdate();
			transaction.commit();
		}finally {
			session.close();
		}
		return rows;	
	}

}