package com.wolk.hackerRank.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolk.hackerRank.entity.HackerRankUserEntity;
import com.wolk.hackerRank.util.HibernateUtil;
import com.wolk.hackerRank.dto.hackerRank;

public class RegistrationDAOImpl implements RegistrationDAO {

	public int save(HackerRankUserEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtil.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(entity);
			transaction.commit();
		}			
		finally {
			session.close();
		}
		return 0;
	}

}