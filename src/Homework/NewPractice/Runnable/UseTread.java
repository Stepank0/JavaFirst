package Homework.NewPractice.Runnable;

public class UseTread {

    public static void main(String[] args) {

        System.out.println("Зaпycк основного потока");
        MyThread mt = new MyThread("Child #1");

        Thread newThrd = new Thread(mt);

        newThrd.start();

        for(int i =0; i < 50; i++){
            System.out.println(".");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Прерывание основного потока");
            }
        }

        System.out.println(" завершение основного потока");

    }
}
