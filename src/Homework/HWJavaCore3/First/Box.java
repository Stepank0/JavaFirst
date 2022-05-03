package Homework.HWJavaCore3.First;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    ArrayList <T> boxList;

    public ArrayList<T> getBoxList() {
        return boxList;
    }

    public Box(ArrayList<T> boxList) {
        this.boxList = boxList;
    }

    public float getSumBoxList(){
        float result = 0.0f;
        for(T t: getBoxList()){
            if(t!=null) {
                float value = t.getWeight();
                result = result + value;
            }
        }
        return result;
    }

//    public Boolean compareList (Box<T> box) {
//        if(this.getSumBoxList().floatValue)
//
//    }





}
