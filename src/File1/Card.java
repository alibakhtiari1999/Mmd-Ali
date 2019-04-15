package File1;

public class Card {
    int id;
    String name;
    int Mp;
    String desc;
    public CardType cardType;
    public Card(int id, int Mp, CardType cardType) {
        this.Mp = Mp;
        this.id = id;
        this.cardType = cardType;
        name=new String();
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void show(){
    }
    public void setCardType() {

    }

}
