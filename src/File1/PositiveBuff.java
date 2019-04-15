package File1;

public class PositiveBuff extends Buff {

    int holyBuff;
    int powerBuff;

    public PositiveBuff(int holyBuff, int powerBuff) {
        this.holyBuff = holyBuff;
        this.powerBuff = powerBuff;
        buffType=BuffType.positive;
    }
}
