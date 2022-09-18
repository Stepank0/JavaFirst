package Homework.NewPractice.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listsPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            if(i%2 == 0){
                list.add(i);
            }
        }
        print(list);

        list.removeIf( x-> (x%4 ==0));

        print(list);

    }

    public static void print(ArrayList<Integer> list){
        for (Object o : list){
            System.out.println(o);
        }

    }

    public static void excludeFrom(){

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 0, -2, 4, -4, 3,6,7,-9, 10);

        for ( Integer x : list){
            System.out.println(x);

        }

        list.removeIf( x-> x < 0);

        for ( Integer x : list){
            System.out.println(x);
        }

    }
}
