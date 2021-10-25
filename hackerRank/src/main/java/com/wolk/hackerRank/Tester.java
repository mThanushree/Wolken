package com.wolk.hackerRank;

import java.util.Scanner;

import com.wolk.hackerRank.dao.RegistrationDAO;
import com.wolk.hackerRank.dao.RegistrationDAOImpl;
import com.wolk.hackerRank.dto.hackerRank;
import com.wolk.hackerRank.service.RegistrationService;
import com.wolk.hackerRank.service.RegistrationServiceImpl;

public class Tester {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] arg)
	{
		RegistrationService service=new RegistrationServiceImpl();
		
		hackerRank dto=new hackerRank();
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter email");
		String email=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		System.out.println("enter contact");
		long contact=sc.nextLong();
		
	
		dto.setId(id);
		dto.setName(name);
		dto.setPassword(password);
		dto.setContact(contact);
		
		String result=service.validateAndSave(dto);
		System.out.println(result);
	}
	
}