public class StringIndexOutOfBoundsException {
    void index() {
		String name = "testing";
		for(int i = 0; i < name.length(); i++) {
	    System.out.println("Length of the string: " + name.charAt(i));
	}
	    System.out.println(name.charAt(50));
	}
}