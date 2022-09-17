package Homework.NewPractice.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listsPractice {

    public static void main(String[] args) {






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
