package com.wolk.watch;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolk.watch.dao.WatchDAOImpl;
import com.wolk.watch.dto.WatchDTO;
import com.wolk.watch.service.WatchService;
import com.wolk.watch.service.WatchServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    
    	Scanner scanner=new Scanner(System.in);
    	
		System.out.println("Enter Id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter application name");
		String name=scanner.nextLine();
		System.out.println("Enter application type");
		String type=scanner.nextLine();
		System.out.println("Enter application size");
		short size=scanner.nextShort();
		System.out.println("Enter application rating");
		byte rating=scanner.nextByte();
		WatchService service =  (WatchService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("service");
		    
		WatchDTO dto=new WatchDTO();
		dto.setId(id);
		dto.setAppName(name);
		dto.setType(type);
		dto.setSize(size);
		dto.setRating(rating);
		String isSaved = service.validateandSave(dto);
		System.out.println(isSaved);	
    }
}