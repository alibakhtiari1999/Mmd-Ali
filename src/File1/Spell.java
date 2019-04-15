package File1;

public class Spell extends Card{
    Buff buff;
    public Spell(int id, int Mp, Buff buff) {
        super(id, Mp);
        this.buff = buff;
        setCardType();
    }

    @Override
    public void setCardType() {
        cardType=CardType.spell;
    }

    @Override
    public void show() {
        System.out.println(name+","+Mp+","+desc);
    }
}
