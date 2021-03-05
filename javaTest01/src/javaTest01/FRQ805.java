package javaTest01;

public class FRQ805
{
	   public static void main(String[] args)
	   {
	      String s = "AardvOrke";
	      System.out.println(removeVowels(s));
	   }
	   
	   public static String removeVowels(String s)
	   {
		   String noVow="";
		   for(int i=0;i<s.length();i++) {
			   String temp=s.substring(i,i+1);
			   if(isVowel(temp)==true) {
				   noVow=noVow+"";
				   
			   }
			   else
				   noVow=noVow+temp;
		   }
		   return noVow;
		   }

	   
	   public static boolean isVowel(String s)
	    {
	      s = s.toUpperCase();
	        if (s.equals("A") || s.equals("E") || s.equals("I") || s.equals("O") || s.equals("U"))
	         return true;
	      else
	         return false;     
	    }    
	}