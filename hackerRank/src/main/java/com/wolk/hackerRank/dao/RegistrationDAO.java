package com.wolk.hackerRank.dao;

import com.wolk.hackerRank.entity.HackerRankUserEntity;
import com.wolk.hackerRank.entity.HackerRankLoginEntity;

public interface RegistrationDAO {

		int save(HackerRankUserEntity entity);
		HackerRankLoginEntity getByEmail(String email);
		int forgotPassword(HackerRankLoginEntity entity);

	}


