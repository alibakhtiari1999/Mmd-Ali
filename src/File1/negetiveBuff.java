package File1;

public class negetiveBuff extends Buff {
    int posionBuff;
    int weaknessBuff;
    boolean stunBuff;
    boolean disarmBuff;

    public negetiveBuff(int posionBuff, int weaknessBuff, boolean stunBuff, boolean disarmBuff) {
        this.posionBuff = posionBuff;
        this.weaknessBuff = weaknessBuff;
        this.stunBuff = stunBuff;
        this.disarmBuff = disarmBuff;
        buffType=BuffType.negetive;
    }
    public void turnStunBuff(){
        if (stunBuff){stunBuff=false; return;}
        stunBuff=true;
    }
    public void turnDisarmBuff(){
        if (disarmBuff){disarmBuff=false; return;}
        disarmBuff=true;
    }
}
