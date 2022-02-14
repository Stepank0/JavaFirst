package Homework.HW.MyPractice;

import java.util.Arrays;
import java.util.Random;

public class DoSomething {
    public static Random random = new Random();


    public static void main(String[] args) {
        comparisonArray();
        first();

    }

    public static void comparisonArray () {
    //Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
    // Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].

        double[] array = new double[100];
         for (int i = 0; i < array.length; i++) {
             array[i] = Math.random();
         }

        System.out.println(Arrays.toString(array));
         double max = array[0];
         double min = array[0];
         double middle = 0;
            for (int i = 0; i < array.length; i++) {
                if (max < array[i])
                    max = array[i];
                if (min > array[i])
                    min = array[i];
                middle +=array[i]/array.length;
            }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + middle);


    }

    public static void first() {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        int middle = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            middle +=array[i]/array.length;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + middle);



    }
}
