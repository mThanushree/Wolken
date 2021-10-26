package com.wolk.hackerRank.service;


import com.wolk.hackerRank.dto.LoginDTO;
import com.wolk.hackerRank.dto.UserDTO;

public interface RegistrationService {

	String validateAndSave(UserDTO dto);
	String validateandLogin(LoginDTO loginDTO);
	String validateandUpdatePassword(LoginDTO loginDTO);
	
}