package Homework.NewPractice;

import java.util.Arrays;

public class SomethingBox {
    private Object obj;

    public SomethingBox(Object obj) {
        this.obj = obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public static class ThisBoxDemo {

        public static void main(String[] args) {

//            SomethingBox box1 = new SomethingBox(43.3);
//            SomethingBox box2 = new SomethingBox(23);
//
//            if (box1.getObj() instanceof Integer && box2.getObj() instanceof Integer) {
//                int sum = (Integer)box1.getObj() + (Integer)box2.getObj();
//                System.out.println(sum);
//            } else {
//                System.out.println(" вводимые данные не int и не просумируются");
//            }
//            System.out.println(abs(2));
//            String binaryNumber = "1111111111111111111111111111111";
//            String binaryNumber2 = "1111111111111111111111111111111";
//            System.out.println(Arrays.toString((binaryNumber.toCharArray())));
//            int s = binaryNumber.compareTo(binaryNumber2);
//            System.out.println(s);

            int s = 348;
            String sd = Integer.toBinaryString(s);
            System.out.println(sd);
            sd = Integer.toHexString(s);
            System.out.println(sd);
            sd = Integer.toOctalString(s);
            System.out.println(sd);



        }

        public static int abs ( int power){
            int result = 2 << power;

            result = result >> 2;

            return result;
        }
    }


}
