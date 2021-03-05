package javaTest01;

//FR Quiz 0803 Student Starting File

public class FRQ803
{
	public static void main(String[] args)
	{
		System.out.println(isPalindrome("AARDVARK"));
		System.out.println(isPalindrome("RACECAR"));
	}

	public static String getReverse(String s)
	{
		String temp = ""; 
		int n = s.length()-1;
		for (int k = n; k >= 0; k--)
			temp += s.substring(k,k+1);
		return temp;	
	}	

	public static boolean isPalindrome(String s)
	{
		boolean pal = s.equals(getReverse(s));
		return pal;
		
		




	}

}