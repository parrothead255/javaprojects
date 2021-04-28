package Lab11;

public class Card {
    private String suit;
    private String rank;
    private int points;
    private Card c;
    
    public Card() {
        suit="Spades";
        rank="Five";
        points=5;
    }
    public Card(String s, String r, int p) {
        suit=s;
        rank=r;
        points=p;
    }
    
    public String getSuit() {
        return suit;
    }
    public String getRank() {
        return rank;
    }
    public int getPoints() {
        return points;
    }
    
    public void setRank(String r) {
        // TODO Auto-generated method stub
        rank=r;
    }
    public void setSuit(String s) {
        // TODO Auto-generated method stub
        suit=s;
    }
    public void setPoints(int p) {
        // TODO Auto-generated method stub
        points=p;
    }
    public String toString() {
        return "["+suit+", "+rank+", "+points+"]\n";
    }
    public boolean equals(Object that) {
        if (points==((Card)that).getPoints())
            return true;
        return false;
    }
}