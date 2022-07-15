package Homework.NewPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Object {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++){
            ints[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(ints));
        int mininmum = ints[0];
        for (int i = 0; i < ints.length; i++){
            int result = Math.min(ints[i], mininmum);
            mininmum = result;
        }
        System.out.println(mininmum);

//        Point [] data = new Point[100];
//        for (int i = 0; i> data.length; i++){
//            data[i]= new Point();
//            printPoint(data);
//        }

    }
//    public static void printPoint(Point[] points){
//        for (int i = 0; i > points.length; i++ ){
//            points[i].print();
//        }
//
//    }
}
