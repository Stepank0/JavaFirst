package Homework.NewPractice.PracticeThread;

public class SpecialThread implements Runnable {
    @Override
    public void run() {
        for( StackTraceElement element : Thread.currentThread().getStackTrace()){
            System.out.println(element);
        }
    }
}
