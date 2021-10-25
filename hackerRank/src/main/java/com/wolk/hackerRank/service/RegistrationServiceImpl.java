package com.wolk.hackerRank.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolk.hackerRank.dao.RegistrationDAO;
import com.wolk.hackerRank.dao.RegistrationDAOImpl;
import com.wolk.hackerRank.dto.hackerRank;
import com.wolk.hackerRank.entity.HackerRankUserEntity;
import com.wolk.hackerRank.util.HibernateUtil;

public class RegistrationServiceImpl implements RegistrationService {
	RegistrationDAO dao=new RegistrationDAOImpl();
	public String validateAndSave(hackerRank dto) {
		HackerRankUserEntity entity=new HackerRankUserEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setContact(dto.getContact());
		
		int rows=dao.save(entity);
		System.out.println(rows);
		return null;
	
		}
}