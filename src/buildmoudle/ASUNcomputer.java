package buildmoudle;

/**
 * Created by Administrator on 2017/6/12.
 */
public class ASUNcomputer {
    private String mBroad;

    private String OS;

    private String mDisplay;

    public ASUNcomputer(ASUNconfig asuNconfig){
        mBroad = asuNconfig.getBroad();
        OS = asuNconfig.getOS();
        mDisplay = asuNconfig.getDisplay();
    }

    @Override
    public String toString(){
        return mBroad + " " + mDisplay + " " + OS + " ";
    }
}
