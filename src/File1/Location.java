package File1;

public class Location {

    private static int numberOfLocations = 0;

    private boolean isFull = false;
    private static Location loc;

    private Location() {
        if (numberOfLocations < 45){
            loc = new Location();
        }
    }

    public static Location getInstance(){
        return loc;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
