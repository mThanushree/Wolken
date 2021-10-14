public class EmployeeDetails {
	int age;
	String name;
	   public EmployeeDetails(String name, int age){
	      this.age = age;
	      this.name = name;
	   }
	   public void display() {
	      System.out.println("Name of the student is: "+name);
	      System.out.println("Age of the student is: "+age);
	   }

}