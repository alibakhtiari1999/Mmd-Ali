package File1;

public class Board {

    private static Board board;

    private static Location gamePlane[][] = new Location[9][5];

    private Board(){
        if (board==null){

            for (int i = 0; i < 9; i++){
                for (int j = 0; j < 5; j++){
                    gamePlane[i][j] = new Location();
                }
            }

        }
    }

    public static getInstance(){

    }

}
