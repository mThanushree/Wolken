import java.util.Scanner;
class AboutCountry {
    public static void main(String []a) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the name");
	String namee = scan.nextLine();
	System.out.println("enter the number of cultures");
	int culturess = scan.nextInt();
	scan.nextLine();
	System.out.println("enter the bird name");
	String birdd = scan.nextLine();
	System.out.println("enter the minister name");
	String primee = scan.nextLine();
	
	Countryyy c = new Countryyy();
	c.setCountryName(namee);
	c.setNoOfCultures(100);
	c.setNationalBird(birdd);
	c.setPrimeM(primee);
	
	String name = c.getCountryName();
	int cultures = c.getNoOfCultures();
	String bird = c.getNationalBird();
	String prime = c.getPrimeM();
	
	System.out.println( name + " " + cultures + " " + bird + " " + prime);
	}
}