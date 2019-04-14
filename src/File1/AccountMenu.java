
package File1;

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class AccountMenu {
    private String state;
    private static Scanner scanner=new Scanner(System.in);
    private static Pattern pattern;
    private static Matcher matcher;
    private static String createAccount ="^create account ([^ ]+)$";
    private static String login ="^login ([^ ]+)$";
    //private static String createAccount ="^create account ([^ ]+)$";




    public void setState(String state) {
        this.state = state;
    }
    public static String AccountMenu(){
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
                if (!checkUserValidity(userName)){
                    System.out.println("Invalid userName...");
                    continue;
                }
                login(userName);
            }

            pattern = Pattern.compile(createAccount);
            matcher = pattern.matcher(commandTxt);
            if (matcher.find()){
                createAccount(matcher.group(1));

            }
            System.out.println("Invalid command!");

        }


    }
    private static void createAccount (String userName){

    }

    private static boolean login (String userName){
        //check password

        return true;
    }

    private static boolean checkUserValidity(String username){

        return true;
    }

}
