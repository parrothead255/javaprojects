package FRQ;

public class FRQ1103 {
	   public static void main(String[] args)
	   {
	      Card card = new Card("Spades","Jack",10);
	      System.out.println(card);
	   }
	}


	class Card
	{
	   private String suit;
	   private String rank;
	   private int value;

	   public Card(String s, String r, int v)
	   {
	      suit = s;
	      rank = r;
	      value = v;
	   }
	  
	   public String toString()
	   {

		   return "["+suit+" ,"+rank+" ,"+value+"]";


	   }

	}