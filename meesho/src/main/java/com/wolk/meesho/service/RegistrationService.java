package com.wolk.meesho.service;

import com.wolk.meesho.dto.LoginDTO;
import com.wolk.meesho.dto.UserDTO;

public interface RegistrationService {

	String validateandsave(UserDTO dto);

	String validateandLogin(LoginDTO loginDTO);

	String validateandUpdatePassword(LoginDTO loginDTO);

}