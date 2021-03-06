package Chap1006;
import Chap1005.Card;
public class Chap1006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c=new Card("Jack","Clubs",11);
		System.out.println(c);
		Card c2=new Card("Ten","Clubs",10);
		Card c3=new Card("Ten","Hearts",10);
		if (c.equals(c2))
			System.out.println(c+" equals "+c2);
		else
			System.out.println(c+ " does not equal "+ c2);
		if (c3.equals(c2))
			System.out.println(c3+" equals "+c2);
		else
			System.out.println(c3+ " does not equal "+ c2);
	}

}
