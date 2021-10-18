package wolk;

import java.util.HashMap;

public class Hashh {
	public static void main(String []args) {
		HashMap map = new HashMap();
		
		map.put(2151,"malnad");
		map.put(9636, "cafee");
		
		//To remove
		map.remove(2151);
		
		//Casting 
		String s = (String) map.get(2151);
	    System.out.println(s);
		
		s = (String) map.get(9636);
	    System.out.println(s);
	    
	    //To print all the data
		System.out.println(map);
		
	}

}
