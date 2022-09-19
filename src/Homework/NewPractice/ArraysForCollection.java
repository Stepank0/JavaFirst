package Homework.NewPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysForCollection {
    public static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        methodAddAll(list, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        print(list);

        methodFill(list);
        print(list);

        methodNCopies();
        methodReplaceAll(list);
        print(list);

        methodCopy(list);
        print(list);

        methodReverse(list);
        print(list);

        methodSort(list);
        print(list);

        methodRotate(list);
        print(list);

        methodShuffle(list);
        print(list);

        System.out.println(methodMin(list));
        System.out.println(methodMax(list));

        System.out.println(methodFrequency(list, 7));

        System.out.println(methodBinarySearch(list, 7));
        print(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        methodAddAll(list2, 8, 4, 71, 1, 69, 98, 12);
        System.out.println(methodDisjoint(list, list2));



    }
    public static boolean methodDisjoint(ArrayList<Integer> list1, ArrayList<Integer> list2){
        boolean isDifferent = Collections.disjoint(list1, list2);
        return isDifferent;

    }
    public static int methodBinarySearch(ArrayList<Integer> list, int number){
        methodSort(list);
        int search = Collections.binarySearch(list, number);
        return search;
    }
    public static int methodFrequency(ArrayList<Integer> list, int x){
        int s = Collections.frequency(list, x);
        return s;
    }
    public static int methodMax(ArrayList<Integer> list){
        int s = Collections.max(list);
        return s;
    }
    public static int methodMin(ArrayList<Integer> list){
        int s = Collections.min(list);
        return s;
    }
    public static ArrayList<Integer> methodShuffle(ArrayList<Integer> list){
        Collections.shuffle(list);
        return list;
    }
    public static ArrayList<Integer> methodRotate(ArrayList<Integer> list){
        Collections.rotate(list, 3);
        return list;
    }
    public static ArrayList<Integer> methodSort(ArrayList<Integer> list){
        Collections.sort(list);
        return list;
    }
    public static ArrayList<Integer> methodReverse(ArrayList<Integer> list){
        Collections.reverse(list);
        return list;
    }
    public static ArrayList<Integer> methodCopy(ArrayList<Integer> list){
        ArrayList<Integer> srcList = new ArrayList<Integer>();
        Collections.addAll(srcList, 2, 3, 5, 7, 9, 16, 77);
        try {
                Collections.copy(list, srcList);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e + " Длина копируемого листа больше чем оригинальный");
        }
        return list;
    }
    public static ArrayList<Integer> methodReplaceAll(ArrayList<Integer> list){
        Collections.replaceAll(list, 69, 7);
        return list;
    }
    public static void methodNCopies(){
        List<Integer> fake = Collections.nCopies(5, 1);
        ArrayList<Integer> list = new ArrayList<>(fake);
         for (int i : list){
             System.out.print(i);
         }
        System.out.println("\n-------------");
    }
    public static ArrayList<Integer> methodFill(ArrayList<Integer> list){
        Collections.fill(list, 69);
        return list;
    }

    public static void print (ArrayList<Integer> list){
        for(int i : list){
            System.out.print(i + ", ");
        }
        System.out.println("\n-------------");
    }
    public static ArrayList<Integer> methodAddAll(ArrayList<Integer> list, Integer... x)
    {
        Collections.addAll(list, x);
        return list;
    }
}
