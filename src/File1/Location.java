package File1;

public class Location {
    private static int numberOfLocations = 0;
    private boolean isFull = false;
    private Location loc;
    private Card cardOnLocation;
    private Spell spell;

    public Card getCardOnLocation() {
        return cardOnLocation;
    }
    public void setCardOnLocation(Card cardOnLocation) {
        if (cardOnLocation==null){
            this.cardOnLocation = cardOnLocation;
            System.out.println("card sucsessfully put in cell");
        }
        System.out.println("there is already a card in this cell, try another cell. ");
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
