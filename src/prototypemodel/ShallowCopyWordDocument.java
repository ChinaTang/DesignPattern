package prototypemodel;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/13.
 */

/**
 * 拷贝函数，只能深拷贝基本类型，虽然String是引用类型，但是变现出值类型的特性，所以该例子中，副本中改变mText字段对原型没用影响
 */
public class ShallowCopyWordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> mImage = new ArrayList<>();

    public ShallowCopyWordDocument(){
        System.out.println("--------------ShallowCopyWordDocument-------------------");
    }

    @Override
    protected ShallowCopyWordDocument clone(){
        try {
            ShallowCopyWordDocument document = (ShallowCopyWordDocument)super.clone();
            document.mText = this.mText;
            document.mImage = this.mImage;
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
