package Homework.NewPractice.LambdaExpressions;

import java.util.*;

public class exsComparator {

    public static ArrayList<String> list = new ArrayList<>();


    public static void main(String[] args) {

        addList("Hello, ", "this ", "is ", "the ", "man ", "world.");
        print(list);
        secondComparator();


    }

    public static void addList(String... str){
        for (String s : str){
            list.add(s);
        }
    }

    public static void secondComparator(){
//        for fist
//        Comparator<String> comparator = (String o1, String o2) ->
//        {
//            return o1.length() - o2.length();
//        };
//
//        Collections.sort(list, comparator);

//        for second
        list.sort((o1, o2) -> o1.length() - o2.length());
        print(list);
    }

    public static void firstComparator(){

        Comparator<String > comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Collections.sort(list, comparator);
        print(list);
    }

    public static void print(ArrayList<String> arrayList){
        for(String str : arrayList){
            System.out.print(str);

        }
        System.out.println();
    }
}
