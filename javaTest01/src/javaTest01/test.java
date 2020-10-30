package javaTest01;

public class test {
	public static void main(String args[]) {
	
		
	for(int q=0;q<=2;q++) {	
		for(int d=0;d<=5;d++) {
			for(int n=0;n<=10;n++) {
				int sum=(q*25)+(d*10)+(n*5);
					if(sum==50) {
					System.out.println(q+" Quarters + "+d+" Dimes + "+n+" Nickles = "+sum+" cents");
					
					}	
				}
			}
		}
	}
}
