package File1;

public class Spell extends Card{
    Buff buff;
    public Spell(int id, int Mp, CardType cardType, Buff buff) {
        super(id, Mp, cardType);
        this.buff = buff;
    }

    @Override
    public void setCardType() {
        cardType=CardType.spell;
    }
}
