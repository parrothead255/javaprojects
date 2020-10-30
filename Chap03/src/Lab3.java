
public class Lab3 {

	public static void main(String args[]) {
		int totalMilli=1000000000;
		int totalSec=totalMilli/1000;
		int hours=totalSec/3600;
		int remSec =totalSec%3600;
		int minutes=remSec/60;
		int seconds=remSec%60;
		int mill=totalMilli%60;
		
		System.out.println("Lab03, 80 Point Version\n");
		System.out.println("Staring milliseconds:\t"+totalMilli);
		System.out.println("Hours\t\t\t"+hours);
		System.out.println("Minutes\t\t\t"+minutes);
		System.out.println("Seconds\t\t\t"+seconds);
		System.out.println("Milliseconds\t\t"+mill);
	}

}
