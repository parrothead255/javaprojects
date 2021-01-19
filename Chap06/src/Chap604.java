import java.util.Random;

public class Chap604 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random bomb=new Random(12345);
		for(int i=0;i<122;i++) {
		int gallons=bomb.nextInt();
		System.out.println(gallons);}
		for(int i=4;i>0;i--) {
			int diceRoll=bomb.nextInt(20)+1;
			System.out.println(diceRoll);
			}
		int range=99-10+1;
		for(int i=0;i<20;i++) {
		int theNum=bomb.nextInt(range)+10;
		System.out.println(theNum);
			}
		System.out.println();
		double g=bomb.nextDouble();
		System.out.println(g);
		range=52;
		for(int i=0;i<26;i++) {
		char theLetter=(char)(bomb.nextInt(range)+65);
		System.out.println(theLetter);
		}
	}
}
