package Homework.NewPractice.PracticeThread.WaiterWithThread;

public class Table {

    private static byte numberTable;

    private byte number = ++numberTable;

    public Order getOrder(){
        return new Order(number);
    }
}
