package Homework;

public class FirstHW {
    public static void main(String[] arge) {
        checkThreeWords();
        System.out.println("****************************");
        if ( CheckSumSing(10, 15)) {
            System.out.println( "Sum positive");
        } else {
            System.out.println( " Sum negative ");
        }
        System.out.println("****************************");
        System.out.println(printColor(10));

        System.out.println("****************************");
        System.out.println(compareNumbers(588, 44));

        System.out.println("****************************");

        int result1 = summa(45, 50); // а это получается масив ????
        System.out.println("First result is " + result1);
        int result2 = summa(6, -5);
        System.out.println("Second result is " + result2);

    }


    public static void checkThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static boolean CheckSumSing( int a, int b){
        return (a + b) >= 0;
    }
//    public static void CheckSumSing() {
//        int a = -50;
//        int b = 10;
//        int sum = a + b;
//        if (sum >= 0) {
//            System.out.println("Сумма положительная");
//        } else {
//            System.out.println("Сумма отрицательная");
//        }
//    }

    public static String printColor(int value) {
        if (value <= 0) {
            return "Красный";
        } else if (value > 0 && value <= 100) {
            return "Желтый";
        } else {
            return "Зеленый";
        }
    }

    public static String compareNumbers( int a, int b) {

        if ( a >= b ){
            return " a >= b ";
        } else {
            return " a < b ";
        }

    }
    //the following steps are just practice

    public static int summa(int a, int b) {
        return a + b;
    }


}




