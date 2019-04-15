
package File1;

import java.util.Scanner;

public class MainMenu {

    private static Scanner scanner=new Scanner(System.in);
    public static AccountMenu accountMenu=new AccountMenu();
    public static CollectionMenu collectionMenu=new CollectionMenu();

    public static void openMenu(){
        accountMenu.openMenu();
        help();
        while (true){
            String commandTxt=scanner.nextLine();
            if (commandTxt.equals("Collection")){
                collectionMenu.openMenu();
                continue;
            }
            if (commandTxt.equals("Shop")){
                continue;
            }
            if (commandTxt.equals("Battle")){
                continue;
            }
            if (commandTxt.equals("Exit"))return;
            if (commandTxt.equals("Account settings")){
                accountMenu.openMenu();
                continue;
            }
            if (commandTxt.equals("help")){
                help();
                continue;
            }
            System.out.println("Invalid command!");
        }
    }
   public static void help(){
       System.out.println("1.Collection");
       System.out.println("2.Shop");
       System.out.println("3.Battle");
       System.out.println("4.Exit");
       System.out.println("5.Account settings");
       System.out.println("6.help");
   }
}
