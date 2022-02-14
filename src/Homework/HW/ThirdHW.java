package Homework.HW;


import java.util.Random;
import java.util.Arrays;

public class ThirdHW {
    public static Random random = new Random();

    public static void main(String[] arge) {

        firstTask();
        System.out.println("*********************");

        secondTack();
        System.out.println("*********************");

        System.out.println(Arrays.toString(thirdTack(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        System.out.println("*********************");
        table(6, 6);

        System.out.println("*********************");
        fourthTack(6);

        System.out.println("*********************");
        System.out.println(Arrays.toString(fifthTack(5, 23)));

        System.out.println("*********************");

        sixthTack(12);

        int[] arr = new int[12];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random()*31) - 15);
        }

        int min, max = min = arr[0];

        System.out.println(Arrays.toString(arr));

        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }




    public static void firstTask() {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(2);

        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 - array[i];
        }
        System.out.println(Arrays.toString(array));

    }


    public static void secondTack() {
        int emptyArray[] = new int[100];
        int count = 1;
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = count;
            count++;
        }
        System.out.println(Arrays.toString(emptyArray));

    }

    public static int[] thirdTack(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }

        }

        return array;
    }

    public static void table(int height, int width) {
//        Этот метод я для себя сам воспроизвёл для понимания и доп. тренировки.
        String arr[][] = new String[height][width];
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[i].length; a++) {
                arr[i][a] = "[" + i + "." + a + "]";
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[i].length; a++) {
                System.out.print(arr[i][a] + "\t");
            }
            System.out.println();
        }
    }

    public static void fourthTack(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            table[i][i] = 1;
            table[i][size - i - 1] = 1;
        }

        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(table[i]));
    }

    public static int[] fifthTack(int len, int initialValue) {
        int lenArray[] = new int[len];
        for (int i = 0; i < lenArray.length; i++) {
            lenArray[i] = initialValue;

        }
        return lenArray;
    }

    public static int[] sixthTack (int size) {
        int[] arr = new int[size];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random()*31) - 15);
        }
//        В этом рандомном методе есть минус того что я задаю рандомные числа от - 15 до 15.
//        а если нужны другие число то нужно лезть в код и менять цикл.

        int min, max = min = arr[0];

        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }


        return arr;

    }


    }



