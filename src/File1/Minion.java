package File1;

public class Minion extends Card {
    private final int originAp;
    private final int originHp;
    public final int maxMove;
    public Card specialPower;
    public int Ap;
    public int Hp;
    public int x;
    public int y;
    public Minion(int id,int Ap,int Hp,CardType cardType,Card specialPower) {
        super(id, cardType);
        maxMove=2;
        originAp=Ap;
        originHp=Hp;
        specialPower=specialPower;
    }
    public void setDeafultApAndHp(){
        Ap=originAp;
        Hp=originHp;
    }
    public void addAp(int value){
        Ap+=value;
    }
    public void addHp(int value){
        Hp+=value;
    }

}
