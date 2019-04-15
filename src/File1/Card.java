package File1;

public class Card {
    int id;
    String desc;
    public CardType cardType;

    public Card(int id, CardType cardType) {
        this.id = id;
        this.cardType = cardType;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
