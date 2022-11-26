package Homework.NewPractice.PracticeThread;

public class ClockSecondVersion implements Runnable {
    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                current.interrupt();
            }


            System.out.println("Tik - Tak");
        }
    }
}
