package File1;

public class MatchResult {
    private String opponentUserName;
    private boolean win; // true mean's victory and false mean's loose.
    private int gameTime;

    public MatchResult(String opponentUserName, boolean win, int gameTime) {
        this.opponentUserName = opponentUserName;
        this.win = win;
        this.gameTime = gameTime;
    }

    public boolean isWin() {
        return win;
    }
}
