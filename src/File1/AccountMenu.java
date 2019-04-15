
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
    private static String createAccountSTR ="^create account ([^ ]+)$";
    private static String loginSTR ="^login ([^ ]+)$";
    private static String passwordSTR="^[0-9]+$";
    private static String showLeaderboardSTR ="show leaderboard";
    private static String logoutSTR ="logout";
    private static String helpSTR ="help";
    private static String saveSTR ="save";

    public AccountMenu() {
        this.accounts = new ArrayList<Account>();
        load();
    }
    public static void openMenu(){
        help();
        while (true){
            String commandTxt=scanner.nextLine();
            //create account
            pattern = Pattern.compile(createAccountSTR);
            matcher = pattern.matcher(commandTxt);
            if (matcher.find()){
                if (findAccount(matcher.group(1))!=null){
                    System.out.println("Taken userName...,make another one.");
                    continue;
                }
                if (creatAccount(matcher.group(1))){
                    System.out.println("Your account was created successfully.");
                }
                continue;
            }
            //login
            pattern = Pattern.compile(loginSTR);
            matcher = pattern.matcher(commandTxt);
            if (matcher.find()){
                String userName=matcher.group(1);
                Account account=findAccount(userName);
                if (account==null){
                    System.out.println("Invalid userName!");
                    continue;
                }
                if (login(account)){
                    System.out.println("You logged in successfully.");
                }
                continue;
            }
            //show leaderboard
            if (commandTxt.equals(showLeaderboardSTR)){
                showLeaderBoard();
                continue;
            }
            //help
            if (commandTxt.equals(helpSTR)){
                help();
                continue;
            }
            //logout
            if (commandTxt.equals(logoutSTR)){
                loginAccount=null;
                System.out.println("You logged out successfully.");
                continue;
            }
            //quit
            if (commandTxt.equals("exit")){
                return;
            }
            //save
            if (commandTxt.equals(saveSTR)){
                save();
                continue;
            }
            //show logged in account
            if (commandTxt.equals("show logged in account")){
                if (loginAccount==null){
                    System.out.println("No account was logged in yet!");
                    continue;
                }
                System.out.println(loginAccount.getUserName());
                continue;
            }
            System.out.println("Invalid command!");
        }
    }
    private static boolean login (Account account){
        System.out.println("Put your password to log in or 'back' to return to Account-menu.");
        while (true) {
            String commadnTxt = scanner.nextLine();
            pattern = Pattern.compile(passwordSTR);
            matcher = pattern.matcher(commadnTxt);
            if (matcher.find()){
                if (account.checkPassword(commadnTxt)){
                    loginAccount = account;
                    return true;
                }
                System.out.println("Wrong password,try again...");
                continue;
            }
            if (commadnTxt.equals("back")){
                return false;
            }
            System.out.println("Invalid password...(password is only digits:0-9)");
        }
    }
    private static void showLeaderBoard(){
        if (accounts.size()==0){
            System.out.println("There's no any user yet.");
            return;
        }
        sortAccounts();
        for (int i=0;i<accounts.size();i++){
            System.out.println(i+1+"-UserName:"+accounts.get(i).getUserName()+
                    "-Wins:"+accounts.get(i).numOfWin());
        }
    }
    private static void sortAccounts(){
        for (int i=0;i<accounts.size();i++){
            for (int j=i+1;j<accounts.size();j++){
                if (!accounts.get(i).compare(accounts.get(j))){
                    Collections.swap(accounts,i,j);
                }
            }
        }
    }//sorting accounts by num of wins.
    private static Account findAccount(String userName){
        for (Account account:accounts){
            if (account.getUserName().equals(userName))return account;
        }
        return null;
    }
    public static boolean creatAccount(String userName){
        System.out.println("Put your password to create an account or 'back' to return to Account-menu.");
        while (true) {
            String commadnTxt = scanner.nextLine();
            pattern = Pattern.compile(passwordSTR);
            matcher = pattern.matcher(commadnTxt);
            if (matcher.find()){
                Account account=new Account(userName);
                    account.setPassword(commadnTxt);
                    accounts.add(account);
                return true;
            }
            if (commadnTxt.equals("back")){
                return false;
            }
            System.out.println("Invalid password...(password is only digits:0-9)");
        }
    }
    public static void help(){
        System.out.println("1.Account menu:");
        System.out.println("2.create account [user name]");
        System.out.println("3.login [user name]");
        System.out.println("4.show leaderboard");
        System.out.println("5.save");
        System.out.println("6.logout");
        System.out.println("7.help");
        System.out.println("8.show logged in account");
        System.out.println("9.exit");
    }
    public static boolean save(){
        System.out.println("Successfully saved.");
        return true;
    }
    public static boolean load(){
        return true;
    }
}
