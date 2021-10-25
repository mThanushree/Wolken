package com.wolk.hackerRank.service;


import com.wolk.hackerRank.dto.hackerRank;

public interface RegistrationService {

	String validateAndSave(hackerRank dto);
	
}