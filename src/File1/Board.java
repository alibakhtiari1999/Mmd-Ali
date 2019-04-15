package File1;

public class Board {
    private static Board board;
    private static final int mapX=9;
    private static final int mapY=5;
    private static Location[][] gamePlane;

    private Board(){
        gamePlane = new Location[mapX][mapY];
    }
    public static Board getInstance(){
        if (board==null){
            board = new Board();
        }
        return board;
    }
    public int determineDistance(int x1,int y1,int x2,int y2){
        int distance = Math.abs(x1-x2)+Math.abs(y1-y2);
        return distance;
    }

}
