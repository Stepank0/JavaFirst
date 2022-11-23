package Homework.NewPractice.PracticeThread;

public class Solution {

    public static void main(String[] args) {

        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("-------------");

        for( StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()){
            System.out.println(stackTraceElement);
        }
    }
}
