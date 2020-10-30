
public class Chap313 {

	public static void main(String args[]) {
		int a=1000;
		int b=3000;
		int c=6000;
		double mean;
		mean=(a+b+c)/3;
		System.out.println(mean);
		mean=(double)(a+b+c)/3;
		System.out.println(mean);
		mean=(a+b+c)/3.0;
		System.out.println(mean);
		int total=3;
		mean=(a+b+c)/(double)total;
		System.out.println(mean);
		int theInt=50;
		char theChar='A';
		double theDouble=3.14;
		System.out.println((char)theInt);
		
	}

}
