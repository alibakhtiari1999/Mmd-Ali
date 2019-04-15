package File1;

import java.util.ArrayList;

public class Location {
    private static int numberOfLocations = 0;
    private boolean isFull = false;
    private Location loc;
    private Card cardOnLocation;
    private ArrayList<Spell> spells;

    public ArrayList<Spell> getSpells() {
        return spells;
    }
    public void setSpell(Spell spell) {
        this.spells.add(spell);
    }
    public Card getCardOnLocation() {
        return cardOnLocation;
    }
    public void setCardOnLocation(Card cardOnLocation) {
        if (cardOnLocation==null){
            this.cardOnLocation = cardOnLocation;
            System.out.println("card successfully put in cell");
        }else {
            System.out.println("there is already a card in this cell, try another cell.");
        }
    }
    private Location() {
        if (numberOfLocations < 45){
            loc = new Location();
        }
    }
    public Location getInstance(){
        return loc;
    }
    public boolean isFull() {
        return isFull;
    }
    public void setFull(boolean full) {
        isFull = full;
    }
}
