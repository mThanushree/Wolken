package com.wolk.Planet.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolk.Planet.util.HibernateUtils;
import com.wolk.Planet.entity.PlanetDetails;

public class PlanetSystemDAOImpl implements PlanetSystemDAO {
	public boolean save(PlanetDetails entity) {
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			if(entity!=null) {
				result=true;
			}else {
				result=false;
			}
		}finally {
			session.close();
		}
		return result;
	}

	public boolean getById(int id) {
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		PlanetDetails entity=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			entity=session.get(PlanetDetails.class,id);
			System.out.println(entity);
			if(entity!=null) {
				result=true;
			}else {
				result=false;
			}
		}finally {
			session.close();
		}
		return result;
	}

	public boolean updateById(PlanetDetails entity) {
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(entity);
			transaction.commit();
			result=true;
		}finally {
			session.close();
		}
		return result;
	}

	public boolean deleteById(PlanetDetails entity) {
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.delete(entity);
			transaction.commit();
			result=true;
		}finally {
			session.close();
		}
		return result;
	}
    
}
