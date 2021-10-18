package wolk;

import java.util.TreeMap;

public class Mapp {
	public static void main(String []args) {
		TreeMap tree = new TreeMap();
		
		tree.put(111,"thanu");
		tree.put(222, "shree");
		
		System.out.println(tree.get(111));
		System.out.println(tree.get(222));
		
		System.out.println(tree);
		
	}
	

}
