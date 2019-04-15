package File1;

public class Minion extends Card {
    public static CardType cardType=CardType.minion;
    public final int originAp;
    public final int originHp;
    public final int maxMove;
    public Card specialPower;
    public Targets targets;
    public int Ap;
    public int Hp;
    public int x;
    public int y;
    public Minion(int id,int Mp,int Ap,int Hp,CardType cardType,Card specialPower) {
        super(id,Mp,cardType);
        maxMove=2;
        originAp=Ap;
        originHp=Hp;
        specialPower=specialPower;
        setCardType();
        targets=new Targets();
    }
    @Override
    public void setCardType() {
        cardType = CardType.minion;
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
    public void move(int x,int y){
        this.x+=x;
        this.y+=y;
    }

    @Override
    public void show() {
        System.out.println(cardType+","+specialPower.name+","+name+","+",class,"+originAp
        +","+originHp+","+ Mp);
    }
}
