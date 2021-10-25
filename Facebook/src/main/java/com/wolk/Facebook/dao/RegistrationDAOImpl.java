package com.wolk.Facebook.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolk.Facebook.entity.UserEntity;
import com.wolk.Facebook.util.HibernateUtil;

public class RegistrationDAOImpl implements RegistrationDAO {
	
	public int save(UserEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtil.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			
		}finally {
			session.close();
		}
		return 0;
	}
}