package buildmoudle;

/**
 * Created by Administrator on 2017/6/9.
 */
public class MacComputer extends Computer{

    protected MacComputer(){}

    @Override
    public void setOS() {
        mOS = "Mac OS X 10.0";
    }

    public static class MacComputerBuilder extends Builder{

        private final ComputerAttribute computerAttribute;

        public MacComputerBuilder(){
            computerAttribute = new ComputerAttribute();
        }

        @Override
        public Builder builderBoard(String Board) {
            computerAttribute.mComputerBoard = Board;
            return this;
        }

        @Override
        public Builder builderDisplay(String Display) {
            computerAttribute.mComputerDisplay = Display;
            return this;
        }

        @Override
        public Builder builderOS() {
            return this;
        }

        @Override
        public Computer create() {
            Computer computer = new MacComputer();
            computer.setmDisplay(computerAttribute.mComputerDisplay);
            computer.setmBoard(computerAttribute.mComputerBoard);
            computer.setOS();
            return computer;
        }
    }
}
