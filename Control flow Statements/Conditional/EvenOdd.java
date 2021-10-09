import java.util.Scanner;
class EvenOdd {
    public static void main(String []a) {
	int num;
	Scanner input = new Scanner(System.in);
	System.out.println("enter a number");
	num = input.nextInt();
	if(num % 2 == 0)
	    System.out.println("even");
	else
	    System.out.println("odd");
	}
}