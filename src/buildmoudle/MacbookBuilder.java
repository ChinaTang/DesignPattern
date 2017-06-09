package buildmoudle;

/**
 * Created by Administrator on 2017/6/9.
 */
public class MacbookBuilder extends Builder{

    private Computer computer = new MacComputer();

    @Override
    public Builder builderBoard(String board) {
        computer.setmBoard(board);
        return this;
    }

    @Override
    public Builder builderDisplay(String display) {
        computer.setmBoard(display);
        return this;
    }

    @Override
    public Builder builderOS() {
        computer.setOS();
        return this;
    }

    @Override
    public Computer create() {
        return computer;
    }
}
