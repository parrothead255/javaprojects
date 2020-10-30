import java.util.Scanner;

public class Chap502 {
	public static void main(String Args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many subs do you want?");
		double numSubs=input.nextDouble();
		if(numSubs>37) {
			System.out.println("Thats too many subs.");
			System.out.println("You can only have 1 sub now.");
			numSubs=1;
		}
		System.out.println("Thank you for visiting Subway!");
	}
}
