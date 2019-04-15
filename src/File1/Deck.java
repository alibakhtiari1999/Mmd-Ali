package File1;

import java.util.ArrayList;

public class Deck {
    private String name;
    public ArrayList<Card> cards;
    public Deck(String name) {
        this.name = name;
        cards=new ArrayList<Card>();
    }
}
