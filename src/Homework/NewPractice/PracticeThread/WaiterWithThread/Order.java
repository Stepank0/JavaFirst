package Homework.NewPractice.PracticeThread.WaiterWithThread;

public class Order {

    private long time;

    private byte numberTable;

    public Order(byte numberTable) {
        time = (long) (Math.random()*200);
        this.numberTable = numberTable;
    }

    public long getTime() {
        return time;
    }

    public byte getNumberTable() {
        return numberTable;
    }
}
