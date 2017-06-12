package buildmoudle;

/**
 * Created by Administrator on 2017/6/9.
 */
public class BuildMoudleMain {

    public static void main(String[] args){
        Computer computer;
        Builder builder = new MacbookBuilder();
        computer = builder.builderBoard("ASUN").builderDisplay("RETAIN").builderOS().create();
        System.out.println(computer);

        MacComputer.MacComputerBuilder computerBuilder = new MacComputer.MacComputerBuilder();
        computer = computerBuilder.builderBoard("ASUN2").builderDisplay("RETAIN2").builderOS().create();
        System.out.print(computer);
    }

}
