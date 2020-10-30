import java.util.Scanner;

public class Chap514 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Choose a rock: Granite, Quart or Pumice");
		String rock=input.next();
		boolean goodRock=rock.equals("Granite") || rock.equals("Quartz");
		System.out.println(goodRock);
		while(!goodRock ) {
			System.out.println("Choose the right rock: Granite, Quart or Pumice");
			rock=input.next();
			goodRock=rock.equals("Granite") || rock.equals("Quartz");
			

		}
		
	}
}
