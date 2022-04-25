package Homework.NewPractice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class JavaRush {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int number = scan.nextInt();


        do{
            System.out.println(s);
            number -=1;
            if (number <= 0 || number >= 5) {
                break;
            }
        } while (number > 0);





    }

    public static void something() {


//piramida
//        for(int i = 0; i < 10; i++){
//            int line = 0;
//            line += i;
//            for(int j = 0; j <= line; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int min1 = Integer.MAX_VALUE;
//        int min2 = Integer.MAX_VALUE;
//        while(scan.hasNextInt()){
//            int x = scan.nextInt();
//            if (x < min1) {
//                min2 = min1;
//                min1 = x;
//            }else if (min1 < x && x < min2){
//                min2 = x;
//
//            }
//        }
//
//        System.out.println(min2);
//
//        scan.close();


//            Scanner scan = new Scanner(System.in);
//
//
//            // max value
//            int max = Integer.MIN_VALUE;
//            while (scan.hasNextInt()){
//                int x = scan.nextInt();
//                if( x > max ){
//                    max = x;
//
//                }
//            }
//            System.out.println(max);
//
//
//
//
//
//        int sum = 0;
//        int a =1;
//        while (a<=100){
//            if((a%3)==0){
//                a++;
//                continue;
//            }
//
//            sum +=a;
//            a++;
//            System.out.println(sum);
//        }
//
//        boolean isExit = false;
//        String word = null;
//        while(!isExit){
//            word = scan.nextLine();
//            if(word.equals("enough"))break;
//            System.out.println(word);
//        }
//
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
//
//
//        boolean inEnter = false;
//        int result = 0;
//        while(!inEnter) {
//            String str = scan.nextLine();
//            if (inEnter = str.equals("ENTER")) {
//                System.out.println(result);
//
//                break;
//            }
//
//            int number = Integer.parseInt(str);
//            result += number;

        }


    }

    

