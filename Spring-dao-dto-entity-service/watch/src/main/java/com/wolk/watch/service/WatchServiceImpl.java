package com.wolk.watch.service;

import java.util.Objects;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolk.watch.dao.WatchDAO;
import com.wolk.watch.dao.WatchDAOImpl;
import com.wolk.watch.dto.WatchDTO;
import com.wolk.watch.entity.WatchEntity;

public class WatchServiceImpl implements WatchService {
	SessionFactory factory=null;
	

	public String validateandSave(WatchDTO dto) {
		
		if(dto.getId() > 0) {
			if(!dto.getAppName().equals(null) && !dto.getAppName().equals("")) {
				if(!dto.getType().equals(null)&& !dto.getType().equals("")) {
					if((dto.getSize() > 0)) {
						if(dto.getRating()>0 && dto.getRating() < 6) {
							WatchDAO dao = (WatchDAO) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
							WatchEntity entity=new WatchEntity();
							entity.setId(dto.getId());
							entity.setAppName(dto.getAppName());
							entity.setType(dto.getType());
							entity.setSize(dto.getSize());
							entity.setRating(dto.getRating());
						
							int isSaved = dao.saveData(entity);
							if(isSaved>0) {
								return "Data Saved";
							}else {
								return "Data not saved";
							}
						}else {
							return "Invalid rating";
						}
					}else {
						return "Invalid size";
					}
				}else {
					return "Invalid Application type";
				}
			}else {
				return "Invalid Application name";
			}
		}else {
			return "Invalid Id";
		}
		
	
	}
}