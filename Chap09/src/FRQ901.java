
public class FRQ901 {
	   public static void main(String[] args)
	   {
	     for (int k = 1; k <= 20; k++)
	      System.out.print(getRandom(10,99) + " ");
	   }
	    
	   public static int getRandom (int min, int max)
	   {
		   int range =max-min+1;
		   int x = (int)(Math.random()*range+min);
		   return x;
	 

	 

	   }
	}