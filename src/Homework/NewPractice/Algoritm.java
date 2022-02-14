package Homework.NewPractice;

import java.util.Arrays;

public class Algoritm {

    public static void main(String[] args) {
        double[] nums = {3.2, 4.2,5.8,4.6,1.2,7.1};
        double[] nums2 = {3.2, 4.2,5.8,4.6,1.2,7.1,1.2,9.8,5.7};
        int[] nums3 = { 1, 2,3,4,5,6,7,8};
        arithmeticMean(nums);
        arithmeticMean(nums2);


        calculate(20);
        swap(2,5);

        invert(nums3);
        invert(new int[]{-1,-2,-3,-4,-5,-6});


    }

    public static double arithmeticMean (double[] arr) {
        double result  = 0;
         for(double c: arr){
             result += c;
         }
        result = result / arr.length;
        System.out.println(" Arithmetic mean > " + result);
        return result;
    }

    public static int calculate (int n){
        int a0 = 0;
        int a1 = 1;
        int result = 0;
        System.out.print("-" + a0 + "-" + a1 + "-" );
        for( int i = 0; i < n; i++){
            result = a0+a1;
            a0 = a1;
            a1 = result;
            System.out.print(result + "-");

        }
        return result;
    }
    public static void swap (int a, int b ) {
        int tmp = a;
        a = b;
        b = tmp;

        System.out.println( "\n a =" + a + " b = " + b );


    }

    public static void invert (int[] array){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[ array.length - i - 1];
            array[ array.length - i - 1] = tmp;

        }
        System.out.println(Arrays.toString(array));
    }
}
