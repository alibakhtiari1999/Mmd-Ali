package File1;

import java.util.ArrayList;

public class Shop {
public ArrayList<Card> cards;
public ArrayList<Item> items;

    public Shop() {
        cards=new ArrayList<Card>();
        items=new ArrayList<Item>();
    }
    public static void openMenu(){
        System.out.println("Shop Menu called.");
    }
    public boolean addCard(){

        return true;
    }
    public boolean addItem(){

        return true;
    }
    public int searchInCards(String name){
        for (Card card:cards) {
            if (card.name.equals(name))return card.id;
        }
        return 0;
    }
    public int searchInItems(String name){
        for (Card card:cards){
            if (card.name.equals(name))return card.id;
        }
        return 0;
    }
    public void search(String name){
        int id=searchInCards(name);
        if (id!=0){
            System.out.println("One card is founded: "+id);
        }else {
            System.out.println("Not found in cards!");
        }
        id =searchInItems(name);
        if (id!=0){
            System.out.println("One item is founded: "+id);
        }else {
            System.out.println("Not found in items!");
        }
    }
}
