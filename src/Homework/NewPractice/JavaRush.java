package Homework.NewPractice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Stream;

public class JavaRush {

    public static void main(String[] args) {
        double earthDiameter = 12742.0;

        double x = earthDiameter;
        double a = 0;
        double s = 0;

        a = Math.pow(10 , -4);
        s = x*a;
        System.out.println(s);





    }

    public static void something() {


//        Scanner scan = new Scanner(System.in);
//
//      calculate s triangle
//
//        while (scan.hasNextInt()) {
//            int a = scan.nextInt();
//            int b = scan.nextInt();
//            int c = scan.nextInt();
//
//            if ((a+b)>c && (a+c)>b && (b+c)>a && a > 0 && b > 0 && c > 0) {
//                double p = (double) ((a + b + c) / 2.0);
//                double S = (double) (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
//                System.out.println(S);
//                break;
//            } else if( (a+b)<c && (a+c)<b && (b+c)<a ) {
//                System.out.println("важное условие существование треугольника, \n" +
//                        " сумма двух сторон должна быть больше третей стороны  \n" +
//                        "Ваш треугольник не существует");
//            }else {
//                System.out.println(" Стороны должны быть больше 0 ");
//            }
//        }

//        double glass = 0.5;
//        int result = 0;
//        Scanner scan = new Scanner(System.in);
//
//        try {
//            boolean whoAreYou = scan.nextBoolean();
//            if (whoAreYou == true){
//                result = (int) Math.ceil(glass);
//                System.out.println(result);
//            } else if(whoAreYou == false) {
//                result = (int) Math.floor(glass);
//                System.out.println(result);
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input!");
//        }


//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//        int number = scan.nextInt();
//
//
//        do{
//            System.out.println(s);
//            number -=1;
//            if (number <= 0 || number >= 5) {
//                break;
//            }
//        } while (number > 0);


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

    

