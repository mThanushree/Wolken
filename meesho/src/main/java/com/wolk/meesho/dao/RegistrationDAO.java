package com.wolk.meesho.dao;


import com.wolk.meesho.entity.LoginEntity;
import com.wolk.meesho.entity.UserEntity;

public interface RegistrationDAO {

	int save(UserEntity entity);

	LoginEntity getByEmail(String email);

	int forgotPassword(LoginEntity entity);

}