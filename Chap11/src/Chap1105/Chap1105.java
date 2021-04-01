package Chap1105;

public class Chap1105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,22,333,4444,55555,666666,7777777,88888888,999999999};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+",");
			
		}
		System.out.println();
		for(int num:arr) {
			System.out.println(num+",");
		}
		System.out.println();
		for(Object o:arr) {
			System.out.print(o+",");
			
		}
	}

}
