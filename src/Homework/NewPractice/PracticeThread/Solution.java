package Homework.NewPractice.PracticeThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        StopwatchTack();

    }

    public static void StopwatchTack(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.start();

            br.readLine();
            stopwatch.interrupt();

            br.close();
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

    public static void thirdTack(){

        ClockSecondVersion clock = new ClockSecondVersion();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clockThread.interrupt();
    }

    public static void secondTack(){

        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clock.cancel();

    }

    public static void firstTack(){

        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("-------------");

        for( StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()){
            System.out.println(stackTraceElement);
        }

    }
}
