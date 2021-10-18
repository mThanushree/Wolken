package wolk;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestGunn {
	static Scanner scanner = new Scanner(System.in);
	static List<Gunn> guns = new LinkedList();
	
	public static void main(String []args) {
		TestGunn test = new TestGunn();
		while(true) {
			System.out.println("Insert the data");
			System.out.println("Insert multiple data");
			System.out.println("Display all");
			System.out.println("Update name");
			System.out.println("Delete");
			System.out.println("enter any number other number more than five to come out");
			int choose = scanner.nextInt();
			
			if(choose==1) {
					Gunn gun = new Gunn();
					scanner.nextLine();
					System.out.println("enter the name");
					String name = scanner.nextLine();
					System.out.println("enter the type");
					String type = scanner.nextLine();
					System.out.println("enter weight");
					int weight = scanner.nextInt();
					System.out.println("enter the cost: ");
					float cost = scanner.nextFloat();
					gun.setName(name);
					gun.setType(type);
					gun.setWeight(weight);
					gun.setCost(cost);
		      		test.save(gun);
			}
			else if(choose == 2) {
				List<Gunn> listl = new ArrayList<>();
				System.out.println("Enter number of elements:");
				int n = scanner.nextInt();
				for(int i=0;i<n;i++) {
					Gunn gun = new Gunn();
					scanner.nextLine();
					System.out.println("Enter Name: ");
					String name = scanner.nextLine();
					System.out.println("Enter Type: ");
					String type = scanner.nextLine();
					System.out.println("Enter Weight: ");
					int weight = scanner.nextInt();
					System.out.println("Enter Cost: ");
					float cost = scanner.nextFloat();
					gun.setName(name);
					gun.setType(type);
					gun.setWeight(weight);
					gun.setCost(cost);
					
				}
			}
			
			else if(choose == 3) {
				test.getAll();
			}
			
			else if (choose == 4) {
				scanner.nextLine();
				System.out.println("Enter Name: ");
				String name = scanner.nextLine();
				boolean temp = test.updateByName(name);
				if(temp)
					System.out.println("Update Successfully");
				else
					System.out.println("Update Failed");
			}

			else if(choose == 5) {
				scanner.nextLine();
				System.out.println("Enter Name: ");
				String name = scanner.nextLine();
				boolean temp = test.delete(name);
				if(temp)
					System.out.println("Delete Successfully");
				else
					System.out.println("Delete Failed");
			}
			else {
				break;
			}
		}
	}
	void save(Gunn gun) {
		guns.add(gun);
	}
	
	void saveAll(List<Gunn> al) {
		guns.addAll(al);
	}
	
	void getAll() {
		for(Gunn gun : guns) {
			System.out.println("Name: "+gun.getName()+"\n Cost: "+gun.getType()+"\n Weight: "+gun.getWeight()+"\n Type: "+gun.getCost());
		}	
	}
	
	boolean updateByName(String name) {
		for(Gunn gun : guns) {
			if(gun.getName().equalsIgnoreCase(name)) {
				System.out.println("enter gun name");
				name = scanner.nextLine();
				System.out.println("enter the type of gun:");
				String type = scanner.nextLine();
				System.out.println("enter weight of gun:");
				int weight = scanner.nextInt();
				System.out.println("enter the cost of gun:");
				float cost = scanner.nextFloat();
				gun.setName(name);
				gun.setType(type);
				gun.setWeight(weight);
				gun.setCost(cost);
				guns.set(guns.indexOf(gun), gun);
				return true;
			}
		}
		return false;
	}
	
	boolean delete(String name) {
		for(Gunn gun : guns) {
			if(gun.getName().equalsIgnoreCase(name)) {
				guns.remove(gun);
				return true;
			}
		}
		return false;
	}
	}