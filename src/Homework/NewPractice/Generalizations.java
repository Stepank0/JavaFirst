package Homework.NewPractice;

public class Generalizations<T,V> {
private T obj1;
private V obj2;

    public Generalizations(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }
    public  void showTypes() {
        System.out.println("Тип T > " + obj1.getClass().getName());
        System.out.println("Тип V > " + obj2.getClass().getName());
    }

    public static class simpleGenApp{
        public static void main(String[] args) {
            Generalizations<Integer, String> twoGenObj = new Generalizations<>(555, "Hello");
            twoGenObj.showTypes();
            int intObj = twoGenObj.getObj1();
            String strObj = twoGenObj.getObj2();
            System.out.println(intObj);
            System.out.println(strObj);


        }
    }
}
