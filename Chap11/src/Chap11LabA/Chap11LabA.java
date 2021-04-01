package Chap11LabA;
//Lab11avst.java
//The "Sieve of Eratosthenes" Program
//This is the student, starting version of the Lab11a assignment.


import java.text.DecimalFormat;
import java.util.Scanner;


public class Chap11LabA
{
	public static void main(String[] args)
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in);
		final int MAX = input.nextInt();
		boolean primes[];
		primes = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{

		System.out.println("\nCOMPUTING PRIME NUMBERS");

		for(int i=0;i<primes.length;i++) {
			primes[i]=true;
		}
		for(int i=2;i<primes.length;i++) {
			if (primes[i]) {
				for(int j=i+1;j<primes.length;j++) {
					if(j%i==0) {
						primes[j]=false;
					}
						
				}

			}

		}

	}

	public static void displayPrimes(boolean primes[])
	{
		int counter=0;
	
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
		for(int i = 2;i<primes.length;i++) {
			if (primes[i]) {
				DecimalFormat decimalFormat = new DecimalFormat("0000");
				String format = decimalFormat.format(i);
				System.out.println(format+" ");
				counter++;
				
				if(counter==15) {
					System.out.println();
					counter=0;
				}
			

			}
		}


}

}

