package Homework.NewPractice.PracticeThread;

public class Stopwatch extends Thread
{
    private int second;

    @Override
    public void run() {

        try {

            while (!isInterrupted()) {
                Thread.sleep(1000);
                second++;
            }

        } catch (InterruptedException e) {
            System.out.println(second);
        }

    }
}
