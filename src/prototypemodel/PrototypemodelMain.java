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

        /*-------------------------------------------------deepclone-----------------------------------------*/
        DeepCopyDocument deepCopyDocument = new DeepCopyDocument();
        deepCopyDocument.setmText("this is a deepDocument");
        deepCopyDocument.addImage("image_1.jpg");
        deepCopyDocument.addImage("image_2.jpg");
        deepCopyDocument.addImage("image_3.jpg");
        deepCopyDocument.showDocument();

        DeepCopyDocument deepCopyDocument1 = deepCopyDocument.clone();
        deepCopyDocument1.showDocument();
        deepCopyDocument1.setmText("this is a deep clone Document");
        deepCopyDocument1.addImage("image_4.jpg");
        deepCopyDocument1.showDocument();

        deepCopyDocument.showDocument();
    }

}
