package FRQ;

import Card.Card;
import Card.Deck;

public class FRQ1104 {
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		deck.add("Clubs","Three",3);
		deck.add("Diamonds","Four",4);
		deck.add("Hearts","Five",5);
		deck.add("Spades","Six",6);
		System.out.println(deck);
	}
}


class Card1
{
	private String suit;
	private String rank;
	private int value;

	public Card1(String s, String r, int v)
	{
		suit = s;
		rank = r;
		value = v;
	}


	class Deck1 
	{
		private Card[] cards;
		private int size;

		public Deck1() 
		{
			cards = new Card[52];
			size = 0;
		}

		public void add(String suit, String rank, int value)
		{
			Card temp = new Card(suit,rank,value);
			cards[size] = temp;
			size++;
		}

		public String toString()
		{


			String tmp="";
			for(int i=0;i<size;i++) {
				tmp+=cards[i];

			}
			return tmp;





		} 
	}
}