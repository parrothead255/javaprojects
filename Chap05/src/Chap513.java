import java.util.Scanner;

public class Chap513 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Does my body hurt? (Scale 0-100)");
		int hurtMeter=input.nextInt();
		while(hurtMeter<1||hurtMeter>100) {
			System.out.println("Go away");
		}
		
		System.out.println("How long has it been hurting? (Days)");
		int time=input.nextInt();
		while(hurtMeter>99||time>20) {
			System.out.println("Death");
			hurtMeter++;
		}
		if(time<1&&hurtMeter<50) {
			System.out.println("Go away");
			hurtMeter++;
		}
		
		System.out.println("Do you have insurance? (0 = no, 1 = yes)");
		int ins=input.nextInt();
		if ((time<1&&hurtMeter<50)||ins>1) {
			System.out.println("Thanks");
		}
			
		if(time>1&&hurtMeter>50&&ins<1) {
					System.out.println("Death");
					System.out.println("You are feeling "+hurtMeter+" for "+time+" days and you do not have insurance.");
		}
		if(time>=1&&hurtMeter<50||ins>0) {
					System.out.println("Thanks");
					System.out.println("You are feeling "+hurtMeter+" for "+time+" days and you have insurance.");
				}
			}
		}
	
	
	
