package Homework.NewPractice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaRush {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean isExit = false;
        String word = null;
        while(!isExit){
            word = scan.nextLine();
            if(word.equals("enough"))break;
            System.out.println(word);
        }










//        int height=1;
//        while (height <= 10) {
//            int width = 1;
//            while(width <= 20){
//
//                if(height == 1 || height == 10) {
//                    System.out.print("Б");
//                } else if (width == 1 || width == 20) {
//                    System.out.print("Б");
//                } else {
//                    System.out.print(" ");
//                }
//                width++;
//            }
//            height++;
//            System.out.println();
//        }


//        boolean inEnter = false;
//        int result = 0;
//        while(!inEnter) {
//            String a = scan.nextLine();
//            if (inEnter = a.equals("ENTER")) {
//                System.out.println(result);
//
//                break;
//            }
//
//            int number = Integer.parseInt(a);
//            result += number;
//
//        }



    }

    
}
