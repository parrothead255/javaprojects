
public class Chap907 {
	static int numFrogs;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numFrogs=5;
		int numLillyPads=5000;
		
		System.out.println("We have "+numFrogs+" Frogs");
		for(int i=0;i<numLillyPads;i+=numFrogs) {
			System.out.print(i);
		}
		System.out.println();
		fred(50);
	}
	public static void fred(int numFrogs) {
		System.out.println("Fred has "+numFrogs+" Frogs");
		System.out.println("Fred has "+numFrogs+" Frogs");
	}

}
