package com.wolk.hackerRank;

import java.util.Scanner;

import com.wolk.hackerRank.dto.LoginDTO;
import com.wolk.hackerRank.dto.UserDTO;
import com.wolk.hackerRank.service.RegistrationService;
import com.wolk.hackerRank.service.RegistrationServiceImpl;

public class Tester {
	public static void main(String[] args) {
		RegistrationService service=new RegistrationServiceImpl();
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String ans=null;
		do {
			System.out.println("1.Registration");
			System.out.println("2.Login");
			System.out.println("3.Forgot Password");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			if(choice == 1) {
				System.out.println("Enter id");
				int id=scan.nextInt();
				scan.nextLine();
				System.out.println("Enter user name");
				String name=scan.nextLine();
				System.out.println("Enter email id");
				String email=scan.nextLine();
				System.out.println("Enter contact number");
				long contactNo=scan.nextLong();
				scan.nextLine();
				System.out.println("Enter password");
				String password=scan.nextLine();
				System.out.println("Enter confirm password");
				String cnfpassword=scan.nextLine();
				
				UserDTO dto = new UserDTO();
				dto.setId(id);
				dto.setUsername(name);
				dto.setEmail(email);
				dto.setContactNumber(contactNo);
				dto.setPassword(password);
				dto.setCnfpassword(cnfpassword);
				String isSaved=service.validateAndSave(dto);
				System.err.println(isSaved);
			}
			else if(choice == 2) {
				scan.nextLine();
				System.out.println("Enter email id");
				String email=scan.nextLine();
				System.out.println("Enter password");
				String password=scan.nextLine();
				
				LoginDTO loginDTO=new LoginDTO();
				loginDTO.setEmail(email);
				loginDTO.setPassword(password);
				
				String login=service.validateandLogin(loginDTO);
				System.err.println(login);
				
			}
			else if(choice == 3) {
				scan.nextLine();
				System.out.println("Enter email id");
				String email=scan.nextLine();
				
				LoginDTO loginDTO=new LoginDTO();
				loginDTO.setEmail(email);
				String forgot=service.validateandUpdatePassword(loginDTO);
				System.err.println(forgot);
			}
			System.out.println("Do you want to continue");
			ans=scan.nextLine();
		}while(ans.equals("yes"));
		
	}
}