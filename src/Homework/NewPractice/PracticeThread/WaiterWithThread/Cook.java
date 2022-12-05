package Homework.NewPractice.PracticeThread.WaiterWithThread;

public class Cook implements Runnable {

    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()){
            try {
                synchronized (this) {
                    needToWait = !needToCookOrders();
                    if (!needToWait) {
                        cook();
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("Повар отдыхает");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean needToCookOrders() {
        return !Manager.getInstance().getOrderQueue().isEmpty();
    }

    private void cook() {
        Manager manager = Manager.getInstance();
        Order order = manager.getOrderQueue().poll();   // повар берет заказ из очереди
        System.out.println(String.format("Заказ будет готовиться %d мс для стола №%d", order.getTime(), order.getNumberTable()));
        try {
            Thread.sleep(order.getTime());     // готовим блюдо
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Dishes dishes = new Dishes(order.getNumberTable());
        System.out.println(String.format("Заказ для стола №%d готов", dishes.getNumberTable()));
        manager.getDishesQueue().add(dishes);
    }
}
