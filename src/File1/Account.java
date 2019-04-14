package File1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private String userName;
    private int money;
    private String password;
    private ArrayList<MatchResult> matchHistory;
    private CollectionCard collectionCard;
    private ArrayList<Deck> decks;

    public Account(String userName) {
        this.userName = new String(userName);
        this.money = 0;
        this.matchHistory = new ArrayList<MatchResult>();
        this.collectionCard = new CollectionCard();
        this.decks = new ArrayList<Deck>();
        this.password=new String();
    }
    public int getMoney(int value){
        money+=value;
        return money;
    }
    public void addMatchResult(MatchResult matchResult){
        this.matchHistory.add(matchResult);
    }
    public int numOfWin(){
        int count=0;
        for (MatchResult matchResult:this.matchHistory){
            if (matchResult.isWin())count++;
        }
        return count;
    }
    public boolean compare(Account account){
        if (this.numOfWin()>account.numOfWin())return true;
        if (this.numOfWin()<account.numOfWin())return false;
        if (this.userName.compareTo(account.userName)<0)return true;
        return false;
    }

    public String getUserName() {
        return userName;
    }
}
