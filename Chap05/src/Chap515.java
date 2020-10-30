import java.util.Scanner;

public class Chap515 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1=input.nextInt();
		System.out.println("Enter the second number:");
		int n2=input.nextInt();
		
		if(isEven(n1)&&isEven(n2)) {
			System.out.println("This # is even");
		}
		else {
			System.out.println("This # is odd");
		}
		if(isEven(n1)||isEven(n2)) {
			System.out.println("This # is even");
		}
		else {
			System.out.println("This # is odd");
		}
	}
	
	public static boolean isEven(int a) {
		System.out.println("Calling the isEven method. a "+a);
		if(a%2==0)
			return true;
		return false;
	}
}
