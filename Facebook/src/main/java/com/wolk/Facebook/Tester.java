package com.wolk.Facebook;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.wolk.Facebook.dto.UserDTO;
import com.wolk.Facebook.service.RegistrationService;
import com.wolk.Facebook.service.RegistrationServiceImpl;

public class Tester {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ParseException
	{
		RegistrationService service=new RegistrationServiceImpl();
		
		UserDTO dto=new UserDTO();
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter email");
		String email=sc.nextLine();
		System.out.println("enter gender");
		String gender=sc.nextLine();
		System.out.println("enter father name");
		String fatherName=sc.nextLine();
		System.out.println("enter mother name");
		String motherName=sc.nextLine();
		System.out.println("enter date of birth");
		String dob=sc.nextLine();
		Date dob1=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		System.out.println("enter contact no");
		long contact=sc.nextLong();
		System.out.println("enter height");
		int height=sc.nextInt();
		
		dto.setId(id);
		dto.setUsername(name);
		dto.setEmail(email);
		dto.setContactNumber(contact);
		dto.setGender(gender);
		dto.setFatherName(fatherName);
		dto.setMotherName(motherName);
		dto.setDob(dob);
		String result=service.validateandsave(dto);
		System.out.println(result);
	}
}