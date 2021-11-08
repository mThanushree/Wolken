package com.wolk.games.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolk.games.dao.GamesDAO;
import com.wolk.games.dto.GamesDTO;
import com.wolk.games.entity.GamesEntity;

public class GamesImplService implements GamesService {

	public String validateandsave(GamesDTO dto) {
		if(dto.getId()>0) {
  			if(!dto.getCountryName().equals(null) && !dto.getCountryName().equals("")) {
  				if(dto.getPosition()>0) {
  					if(dto.getGold()>=0) {
  						if(dto.getSilver()>=0) {
  							if(dto.getBronze()>=0) {
  								GamesDAO dao =  (GamesDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
  		  						GamesEntity entity=new GamesEntity();
  		  						entity.setId(dto.getId());
  		  						entity.setCountryName(dto.getCountryName());
  		  						entity.setPosition(dto.getPosition());
  		  						entity.setGold(dto.getGold());
  		  						entity.setSilver(dto.getSilver());
  		  						entity.setBronze(dto.getBronze());
  		  						int row=dao.save(entity);
  		  						if(row>0) {
  		  							return "data saved";
  		  						}else {
  		  							return "data not saved";
  		  						}
  		  					}else {
  		  						return "invalid number of bronze medal";
  		  					}
  	  					}else {
  	  						return "invalid number of silver medal";
  	  					}
  					}else {
  						return "invalid number of gold medal";
  					}
  				}else {
  					return "invalid rank";
  				}
  			}else {
  				return "invalid country name";
  			}
  		}else {
  			return "invalid id";
  		}
	}

}