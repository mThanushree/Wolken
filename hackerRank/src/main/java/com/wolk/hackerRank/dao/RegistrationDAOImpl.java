package com.wolk.hackerRank.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolk.hackerRank.entity.HackerRankUserEntity;
import com.wolk.hackerRank.entity.HackerRankLoginEntity;
import com.wolk.hackerRank.util.HibernateUtil;

public class RegistrationDAOImpl implements RegistrationDAO {

	public int save(HackerRankUserEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		int rows = 0;
		try {
			factory=HibernateUtil.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(entity);
			transaction.commit();
			rows = 1;
		}			
		finally {
			session.close();
		}
		return rows;
	}

public HackerRankLoginEntity getByEmail(String email) {
		Session session=null;
		SessionFactory factory=null;
		HackerRankLoginEntity entity=null;
		try {
			factory=HibernateUtil.getInstance();
			session=factory.openSession();
			@SuppressWarnings("unchecked")
			Query<HackerRankLoginEntity> query=session.createNamedQuery("getByEmail");
			query.setParameter("email", email);
			entity=(HackerRankLoginEntity) query.uniqueResult();
		} finally {
			session.close();
		}
		return entity;
	}

public int forgotPassword(HackerRankLoginEntity entity) {
	SessionFactory factory=null;
	Session session=null;
	int rows=0;
	try {
		factory=HibernateUtil.getInstance();
		session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		//String sql="update LoginEntity set password="+"'"+entity.getPassword()+"'"+"where email="+"'"+entity.getEmail()+"'";
		@SuppressWarnings("unchecked")
		//Query<LoginEntity> query=session.createQuery(sql);
		Query<HackerRankLoginEntity> query=session.createNamedQuery("updatePassword");
		query.setParameter("password", entity.getPassword());
		query.setParameter("email", entity.getEmail());
        //query.setParameter(1, entity.getPassword());
        //query.setParameter(2, entity.getEmail());
		rows=query.executeUpdate();
		//rows=query.uniqueResult();
		//System.out.println(rows);
		transaction.commit();
	}finally {
		session.close();
	}
	return rows;	
}

}