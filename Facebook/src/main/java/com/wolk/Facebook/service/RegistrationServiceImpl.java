package com.wolk.Facebook.service;

import com.wolk.Facebook.dao.RegistrationDAO;
import com.wolk.Facebook.dao.RegistrationDAOImpl;
import com.wolk.Facebook.dto.UserDTO;
import com.wolk.Facebook.entity.UserEntity;

public class RegistrationServiceImpl implements RegistrationService {
RegistrationDAO dao=new RegistrationDAOImpl();
	



	public String validateandsave(UserDTO dto) {
		UserEntity entity=new UserEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getUsername());
		entity.setEmail(dto.getEmail());
		entity.setFatherName(dto.getFatherName());
		entity.setMotherName(dto.getMotherName());
		entity.setDob(dto.getDob());
		entity.setContact(dto.getContactNumber());
		entity.setHeight(dto.getHeight());
				
		int rows=dao.save(entity);
		System.out.println(rows);
		return null;
		
	
	}
}
