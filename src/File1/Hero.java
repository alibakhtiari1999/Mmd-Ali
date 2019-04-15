package File1;

public class Hero extends Minion {
    public Card specialPower;
    public Hero(int id,int MP, int Ap, int Hp,Card specialPower) {
        super(id,MP, Ap, Hp,specialPower);
        setCardType();
    }
    @Override
    public void setCardType() {
        cardType=CardType.hero;
    }

    @Override
    public void show() {
        System.out.println(name+","+originAp+","+originHp+",class,"+specialPower.name);
    }
}
