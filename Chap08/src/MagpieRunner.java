import java.util.Scanner;

import Chap10Lab.Untilty;

public class MagpieRunner {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		Magpie m=new Magpie();
		Untilty.rightAllign(m.getGreeting());
		String statement=input.nextLine();
		while(!statement.equals("Bye")) {
			Untilty.rightAllign(m.getResponce(statement));
			statement=input.nextLine();
			
		}
		Untilty.rightAllign(m.getGoodbye());
	}

}
