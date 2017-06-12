package buildmoudle;

/**
 * Created by Administrator on 2017/6/12.
 */
public class ASUNconfig {

    private String broad;
    private String display;
    private String OS;

    private ASUNconfig(){}

    public String getBroad() {
        return broad;
    }

    public String getOS() {
        return OS;
    }

    public String getDisplay() {
        return display;
    }

    public static class Builder{
        private String broad;
        private String display;
        private String OS;
        public Builder setBroad(String Broad){
            broad = Broad;
            return this;
        }
        public Builder setDisplay(String Display){
            display = Display;
            return this;
        }
        public Builder setOS(String os){
            OS = os;
            return this;
        }

        private void apply(ASUNconfig config){
            config.broad = this.broad;
            config.display = this.display;
            config.OS = this.OS;
        }

        public ASUNconfig create(){
            ASUNconfig asuNconfig = new ASUNconfig();
            apply(asuNconfig);
            return asuNconfig;
        }
    }


}
