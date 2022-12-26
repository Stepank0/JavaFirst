package Homework.NewPractice.Pattern.WrapperPattern;

public class WrapperThread {
    public static void main(String[] args) {
        new Thread(new ThirdRunnableImpl(new SecondRunnableImpl(new RunnableImpl()))).start();
    }

    public static class RunnableImpl implements Runnable{

        @Override
        public void run() {
            System.out.println("RunnableImpl started");
        }
    }

    public static class SecondRunnableImpl implements Runnable{

        private Runnable con;

        public SecondRunnableImpl(Runnable con) {
            this.con = con;
        }

        @Override
        public void run() {
            System.out.println("SecondRunnableImpl started");
            con.run();
        }
    }

    public static class ThirdRunnableImpl implements Runnable{

        private Runnable con;

        public ThirdRunnableImpl(Runnable con) {
            this.con = con;
        }

        @Override
        public void run() {
            System.out.println("ThirdRunnableImpl started");
            con.run();
        }
    }


}
