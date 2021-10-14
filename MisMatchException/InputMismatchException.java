import java.util.Scanner;
public class InputMismatchException {
	public static void main (String []args){
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter your Company name: ");
	      String name = scan.next();
	      System.out.println("Enter number of Employees: ");
	      int employeee = scan.nextInt();
	      EmployeeDetails obj = new EmployeeDetails(name, employeee);
	      obj.display();
	   }

}