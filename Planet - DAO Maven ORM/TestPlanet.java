package com.wolk.Planet;

import java.util.Scanner;

import com.wolk.Planet.dao.PlanetSystemDAO;
import com.wolk.Planet.dao.PlanetSystemDAOImpl;
import com.wolk.Planet.entity.PlanetDetails;

public class TestPlanet {
	public static void main(String[] args) {
		PlanetSystemDAO dao = new PlanetSystemDAOImpl();
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String temp;
		do {
			System.out.println("1.Save");
			System.out.println("2.Display");
			System.out.println("3.Update");
			System.out.println("4.Delete by Id");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			if(choice == 1) {
				System.out.println("Enter Planet Id");
				int id=scan.nextInt();
				scan.nextLine();
				System.out.println("Enter Planet name");
				String name=scan.nextLine();
				System.out.println("Enter Planet size");
				String size=scan.nextLine();
				System.out.println("Enter Planet distance");
				int distance=scan.nextInt();
				
				PlanetDetails entity=new PlanetDetails();
				entity.setId(id);
				entity.setName(name);
				entity.setSize(size);
				entity.setDistance(distance);
				
				boolean isSaved=dao.save(entity);
				if(isSaved) {
					System.out.println("Data Saved");
				}else {
					System.out.println("Data not saved");
				}
			}
			
			else if(choice == 2) {
				System.out.println("Enter Planet Id");
				int id=scan.nextInt();
				boolean found=dao.getById(id);
				if(found){
					System.out.println("Data found");
				}else {
					System.out.println("Data not found");
				}
			}
			
			else if(choice == 3) {
				System.out.println("Enter Planet Id");
				int id=scan.nextInt();
				scan.nextLine();
				System.out.println("Enter Planet name");
				String name=scan.nextLine();
				System.out.println("Enter Planet size");
				String size=scan.nextLine();
				System.out.println("Enter Planet distance");
				int distance=scan.nextInt();
				
				PlanetDetails entity=new PlanetDetails();
				entity.setId(id);
				entity.setName(name);
				entity.setSize(size);
				entity.setDistance(distance);
				
				boolean isUpdated=dao.updateById(entity);
				if(isUpdated) {
					System.out.println("Updated Successfully");
				}else {
					System.out.println("Not Updated");
				}
			}
			
			else if(choice == 4) {
				System.out.println("Enter Planet Id");
				int id=scan.nextInt();
				PlanetDetails entity=new PlanetDetails();
				entity.setId(id);
				boolean found=dao.deleteById(entity);
				if(found){
					System.out.println("Deleted data successfully");
				}else {
					System.out.println("Data not found");
				}
			}
			
			scan.nextLine();
			System.out.println("Do you want to continue");
			temp=scan.nextLine();
		}while(temp.equals(temp));
	}
}
