package prototypemodel;

/**
 * Created by Administrator on 2017/6/13.
 */
public class PrototypemodelMain {

    public static void main(String[] args){
        ShallowCopyWordDocument shallowCopyWordDocument = new ShallowCopyWordDocument();
        shallowCopyWordDocument.setmText("this is a Document");
        shallowCopyWordDocument.addImage("image_1.jpg");
        shallowCopyWordDocument.addImage("image_2.jpg");
        shallowCopyWordDocument.addImage("image_3.jpg");
        shallowCopyWordDocument.showDocument();

        ShallowCopyWordDocument copyWordDocument = shallowCopyWordDocument.clone();
        copyWordDocument.showDocument();
        copyWordDocument.setmText("this is a copyDocument");
        copyWordDocument.showDocument();

        shallowCopyWordDocument.showDocument();
    }

}
