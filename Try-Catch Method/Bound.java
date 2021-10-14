public class Bound {
    public static void main(String []args) {
	String []names = {"thanu","nik","priya"};
	for(int i= 0; i <= names.length; i++) {
	try {
	    System.out.println(names[i]);
	} catch(ArrayIndexOutOfBoundsException e) {
	    System.out.println(e.getMessage());
    }
    }	
	 System.out.println("End of main()");
}
}