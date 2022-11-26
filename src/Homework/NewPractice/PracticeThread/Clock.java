package Homework.NewPractice.PracticeThread;

public class Clock implements Runnable{

    private boolean isCancel = false;

    public void cancel() {
     this.isCancel = true;
    }

    @Override
    public void run() {
        try {

            while (!isCancel) {
                Thread.sleep(500);
                System.out.println("Tic");
                Thread.sleep(500);
                System.out.println("Tac");
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
