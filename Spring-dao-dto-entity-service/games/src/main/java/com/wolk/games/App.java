package com.wolk.games;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolk.games.dto.GamesDTO;
import com.wolk.games.service.GamesService;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        String ans;
        do {
        	System.out.println("Enter id");
    		int id=sc.nextInt();
    		sc.nextLine();
    		System.out.println("Enter country name");
    		String name=sc.nextLine(); 
    		System.out.println("Enter rank");
    		int rank=sc.nextInt();
    		System.out.println("Enter number of gold medal");
    		int gold=sc.nextInt();
    		System.out.println("Enter number of silver medal");
    		int silver=sc.nextInt();
    		System.out.println("Enter number of bronze medal");
    		int bronze=sc.nextInt();
    		GamesService service =  (GamesService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("service");
   		 
    		GamesDTO dto=new GamesDTO();
    		dto.setId(id);
    		dto.setCountryName(name);
    		dto.setPosition(rank);
    		dto.setGold(gold);
    		dto.setSilver(silver);
    		dto.setBronze(bronze);
    		
    		String isSaved=service.validateandsave(dto);
    		System.out.println(isSaved);
    		System.out.println("Do yo want to continue:");
    		ans=sc.next();
        }while(ans.equals("yes"));
    }
}