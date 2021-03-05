package javaTest01;

public class FRQ804 {
	   public static void main(String[] args)
	   {
	      String s1 = "a";
	      String s2 = "Q";
	      System.out.println(isVowel(s1));
	      System.out.println(isVowel(s2));
	   }
	   
	   public static boolean isVowel(String s)
	    {
		   s.toLowerCase();
		   boolean isVal = (s.equals("a"))||(s.equals("e"))||(s.equals("i"))||(s.equals("o")); 
			 return isVal;
		   
			  
		   }
		   




	    
	    }    
	