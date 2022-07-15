package Homework.NewPractice.Runnable;

public class MyThread implements Runnable {
    String thrdName;
    MyThread(String name){
        thrdName = name;
    }

    @Override
    public void run() {
        System.out.println(thrdName + " -> запуск. ");
        try {
            for (int i = 0; i < 10; i++){
                Thread.sleep(400);
                System.out.println("B " + thrdName + ", счетчик: " + i);
            }
        } catch (InterruptedException exc){
            System.out.println(thrdName + " - прерван");
        }
        System.out.println(thrdName + " - завершение");

    }
}




