import java.util.Scanner;

public class chap510 {
	
	public static void main(String Args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you play Skyrim");
		String ans=input.nextLine();
		if(ans.equals("Yes")) {
			System.out.println("Modded or unmodded?");
			ans=input.nextLine();
			if(ans.equals(("Modded"))){
				System.out.println("What is wrong with you?");
			}
			else {
				System.out.println("Our battle will be legendary");
			}
					
		}
		else {
			System.out.println("Die, heretic!");
		}
		System.out.println("How many hours have you played?");
		double hours=input.nextDouble();
		if(hours>2078) {
			System.out.println("Do you even sleep?");
		}
		else if(hours>500) {
			System.out.println("Epic gamer nurd.");
		}
		else if(hours>10) {
			System.out.println("THOSE ARE ROOKIE NUMBERS!");
		}
		else {
			System.out.println("I cannot even talk to you.");
		}
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
			System.out.print(i+""+j+",");
			}
			System.out.println();
			}
		}
	
	}	

