package Card;

public class Card {
	private String suit;
	private String rank;
	private int value;
	public Card() {
		suit="Spades";
		rank="King";
		value=13;
	}
	public Card(String s,String r,int v) {
		suit=s;
		rank=r;
		value=v;
		
	}
	public String getSuit() {
		return suit;
	}
	public String getRank() {
		return rank;
	}
	public int getValue() {
		return value;
	}
	public void setRank(String r) {
		rank=r;
		
	}
	public void setSuit(String s) {
		suit=s;
	}
	public void setValue(int v) {
		value=v;
	
		
	}
	public String toString() {
		return "["+getSuit()+","+getRank()+","+getValue()+"]";
	}
	
	
}
