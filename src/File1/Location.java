package File1;

import java.util.ArrayList;

public class Location {
    private static int numberOfLocations = 0;
    private boolean isFull = false;
    private Card cardOnLocation;
    private ArrayList<Spell> spells;
    private final Cell cell;


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
            isFull=true;
        }else {
            System.out.println("there is already a card in this cell, try another cell.");
        }
    }
    private Location(Cell cell) {
        this.cell = cell;
    }
    public Location getInstance(Cell cell) {
        if (numberOfLocations < 45)
        {
            numberOfLocations++;
            return new Location(cell);
        }

        else
        {
            return null;
        }

    }
    public boolean isFull() {
        return isFull;
    }
    public void setFull(boolean full) {
        isFull = full;
    }
}
