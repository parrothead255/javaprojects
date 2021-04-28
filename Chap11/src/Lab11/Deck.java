package Lab11;

public class Deck {
    private Card[] cards;

    private int size;
    private String suit[]= {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String rank[]= {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private int points[]= {2,3,4,5,6,7,8,9,10,10,10,10,11};
    public Deck() {
        cards=new Card[52];
        size=0;
        newDeck();
    }
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void add(String suit, String rank, int points) {
        cards[size]=new Card(suit, rank, points);
        size++;
    }

    public String toString() {
        String tmp="";
        for(int i=0;i<size;i++) {
            tmp+=cards[i];
        }
        return tmp;
    }
    public void newDeck() {
        for (int i=0; i<4; i++)    {
            String tmp=suit[i];
            for(int j=0; j<13; j++){
                String tmp2=rank[j];
                int tmp3=points[j];
                add(tmp, tmp2, tmp3);
            }
        }
    }
    public void shuffle() {
        for (int j=0; j<1000;j++) {
            for (int i=0;i<size-1;i++) {
                int rand = (int)(Math.random()*cards.length);
                Card tmp = cards[i];
                cards[i] = cards[rand];
                cards[rand] = tmp;
            }
        }
    }
}