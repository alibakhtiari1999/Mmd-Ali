package File1;

import java.util.ArrayList;

public class CollectionMenu {
    private ArrayList<Deck> decks;

    public CollectionMenu() {
        this.decks = new ArrayList<Deck>();
    }

    public static void openMenu(){
        System.out.println("Collection Menu called.");
    }
}
