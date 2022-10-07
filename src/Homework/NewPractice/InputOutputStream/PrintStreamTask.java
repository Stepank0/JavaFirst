package Homework.NewPractice.InputOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamTask {
    public static ByteArrayOutputStream baos = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(baos);

    public static void main(String[] args) {

        firstTask();
        reversStream();

    }
    public static void printSomething(String str){
        stream.print(str);
    }

    public static void  reversStream(){
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = baos.toString();
        baos.reset();
        StringBuilder stringBuilder = new StringBuilder(result);
        String reverse = stringBuilder.reverse().toString();
        printSomething(reverse);
        System.out.println(reverse);
        scanner.close();
    }

    public static void firstTask(){

        try{
            stream.print("hello world!");
            stream.print(32345);

            String result = baos.toString();

            System.out.println(result);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
