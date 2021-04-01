package Card;

public class Deck {
	private Card[] cards;
	private int size;
	
	public Deck() {
		cards=new Card[52];
		size=0;
		
	}
	public void add(String suit,String rank,int value) {
		cards[size]=new Card(suit,rank,value);
		size++;
	}
	public String toString() {
		String tmp="";
		for(int i=0;i<size;i++) {
			tmp+=cards[i];
		}
		return tmp;
		
	}
}
