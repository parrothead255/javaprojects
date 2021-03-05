
public class CardRunner {
	public static void main(String []args) {
		Card c=new Card();	
		System.out.println(c.getRank()+" of "+c.getSuit()+", "+c.getValue());
		c.setRank("Jack");
		c.setSuit("Spades");
		c.setValue(11);
		System.out.println(c.getRank()+" of "+c.getSuit()+", "+c.getValue());
		Card c2=new Card("Spades","Queen",12);
		System.out.println(c2.getRank()+" of "+c2.getSuit()+", "+c2.getValue());
		}
	
}