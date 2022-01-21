package Homework;

public class SecondHW {
    public static void main (String[] arge) {
//        Это я просто попробовал к первому заданию и закоментировал чтобы себе сохранить как пример
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        int a = in.nextInt();
//        System.out.println("Введите второе число");
//        int b = in.nextInt();
//        if (checkSum(a, b)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");

        if (checkSum(10, 5)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("************************");

        checkInt(-34);
        System.out.println("************************");

        if (checkPositiveInt(-10 )) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("************************");

        doFive("Lol", 4);

        System.out.println("************************");

        if (checkYear(2020)) {
            System.out.println("false (Високостный)");
        } else {
            System.out.println("true (не високостный)");
        }
        System.out.println("************************");
    }

    public static boolean checkSum(int a, int b) {

        return ((a + b) >= 10 && (a + b) <=20 );
    }

    public static void checkInt (int a) {
        if( a >= 0) {
            System.out.println("positive integer");
        } else {
            System.out.println("integer is negative");
        }
    }

    public static boolean checkPositiveInt( int a ) {
        return a <= 0;
    }

    public static void doFive(String name, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("String #" + i + ": " + name);
        }
    }
// wrong code
//    public static String doFive(String name, int a) {
//        System.out.println(name);
//        int i = 1;
//        do {
//            System.out.println(name);
//            i++;
//        } while (i < a);
//        return name;
//    }

    static boolean checkYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
}

