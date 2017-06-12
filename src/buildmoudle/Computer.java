package buildmoudle;

/**
 * Created by Administrator on 2017/6/9.
 */
public abstract class Computer {
    private String mBoard;
    private String mDisplay;
    protected String mOS;

    protected void setmBoard(String board){
        mBoard = board;
    }

    protected void setmDisplay(String display){
        mDisplay = display;
    }

    protected abstract void setOS();

    @Override
    public String toString(){
        return "Computer[mBoard= " + mBoard + ", mDisplay=" + mDisplay + ", mOS=" + mOS + "]";
    }
}
