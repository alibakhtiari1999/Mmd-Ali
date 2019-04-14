
package File1;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class AccountMenu {

    private static Scanner scanner=new Scanner(System.in);
    private static Pattern pattern;
    private static Matcher matcher;
    private static ArrayList<Account> accounts;
    private static Account loginAccount;
    private static String createAccount ="^create account ([^ ]+)$";
    private static String login ="^login ([^ ]+)$";
    private static String showLeaderboard ="show leaderboard";
    private static String logout ="logout";
    private static String help ="help";



    public AccountMenu() {
        this.accounts = new ArrayList<Account>();
    }
    public static String AccountMainMenu(){
        while (true){
            String commandTxt=scanner.nextLine();
            //create account
            pattern = Pattern.compile(createAccount);
            matcher = pattern.matcher(commandTxt);
            if (matcher.find()){
                createAccount(matcher.group(1));
                continue;
            }
            //login
            pattern = Pattern.compile(login);
            matcher = pattern.matcher(commandTxt);
            if (matcher.find()){
                String userName=matcher.group(1);
                Account account=findAccount(userName);
                if (account==null){
                    System.out.println("Invalid userName!");
                    continue;
                }
                login(account);
                System.out.println("You logged in successfully.");
            }
            //show leaderboard
            if (commandTxt.equals(showLeaderboard)){
                showLeaderboard();
            }
            //help
            if (commandTxt.equals(help)){
                //show validity commands...
                continue;
            }
            //logout
            if (commandTxt.equals(logout)){
                loginAccount=null;
                System.out.println("You logged out successfully.");
                continue;
            }
            System.out.println("Invalid command!");
            //quit
            if (commandTxt.equals("quit")){
                return "quit";
            }
        }


    }
    private static void createAccount (String userName){

    }
    private static void login (Account account){
        loginAccount=account;
    }
    private static void showLeaderboard(){
        sortAccounts();
        for (int i=0;i<accounts.size();i++){
            System.out.println(i+1+"-UserName:"+accounts.get(i).getUserName()+
                    "-Wins:"+accounts.get(i).numOfWin());
        }
    }
    //sorting accounts by num of wins.
    private static void sortAccounts(){
        for (int i=0;i<accounts.size();i++){
            for (int j=i+1;j<accounts.size();j++){
                if (!accounts.get(i).compare(accounts.get(j))){
                    Collections.swap(accounts,i,j);
                }
            }
        }
    }
    private static Account findAccount(String userName){
        for (Account account:accounts){
            if (account.getUserName().equals(userName))return account;
        }
        return null;
    }
}
