package prototypemodel;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/14.
 */
public class DeepCopyDocument implements Cloneable{
    private String mText;
    private ArrayList<String> mImage = new ArrayList<>();

    public DeepCopyDocument(){
        System.out.println("--------------ShallowCopyWordDocument-------------------");
    }

    @Override
    protected DeepCopyDocument clone(){
        try {
            DeepCopyDocument document = (DeepCopyDocument)super.clone();
            document.mText = this.mText;
            //引用类型需要调用自身的clone方法
            document.mImage = (ArrayList<String>) this.mImage.clone();
            return document;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImage() {
        return mImage;
    }

    public void addImage(String mImage) {
        this.mImage.add(mImage);
    }

    public void showDocument(){
        System.out.println("-------------------word content start-------------------");
        System.out.print("Text: " + mText);
        System.out.print("Images List: ");
        for(String imgName : mImage){
            System.out.print("image name : " + imgName);
        }
        System.out.print("-------------------word content end-------------------");
    }
}
