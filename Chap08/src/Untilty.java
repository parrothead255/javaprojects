
public class Untilty {
	public static final int WIDTH = 137;
	public static void rightAllign(String s) {
		int spaces=WIDTH-s.length();
		String temp="";
		for(int i=0;i<spaces;i++) {
			temp+=" ";
			
		}
		System.out.println(temp+s);
	}
	private static void skip(int lines) {
		for(int i=0;i<lines;i++) {
			System.out.println();
		}
	}
}
