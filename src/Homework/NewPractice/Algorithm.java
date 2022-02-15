package Homework.NewPractice;

import java.util.Arrays;
import java.util.Random;

public class Algorithm {



    public static void main(String[] args) {


        double[] nums = {3.2, 4.2,5.8,4.6,1.2,7.1};
        double[] nums2 = {3.2, 4.2,5.8,4.6,1.2,7.1,1.2,9.8,5.7};
        int[] nums3 = { 1, 2,3,4,5,6,7,8};
        int[] nums4 = { 8, 1, 3,0, 9, 4, 7, 2, 5, 6};
        int[][] nums5 = {
                {0,1},
                {3,1,2},
                {4,2,1,3},
                {3,5,2,4,1}
        };
//        System.out.println("---------------------------");
//
//        arithmeticMean(nums);
//        System.out.println("---------------------------");
//        arithmeticMean(nums2);
//        System.out.println("---------------------------");
//
//
//        calculate(20);
//        System.out.println("---------------------------");
//        swap(2,5);
//
//        System.out.println("---------------------------");
//        invert(nums3);
//
//        System.out.println("---------------------------");
//
//        invert(new int[]{-1,-2,-3,-4,-5,-6});
//        System.out.println("---------------------------");
//
////        infoArray(nums4);
////        System.out.println("---------------------------");
//
//        System.out.println(Arrays.deepToString(nums5));
//            for(int[] arr: nums5) {
//                System.out.println(Arrays.toString(arr)+" > ");
//                selectionSort(arr);
//                System.out.println(Arrays.toString(arr));
//            }
//        System.out.println("---------------------------");
//
//        infoArraySelection(nums4);
//        System.out.println("---------------------------");
//
//        System.out.println( searchLinear(nums4, 3));
//        System.out.println("---------------------------");

        int[] nums6 = new int[100];
        Random random = new Random();
        for ( int i =0 ; i<nums6.length;i++) {
            nums6[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(nums6));
        selectionSort(nums6);
        System.out.println(Arrays.toString(nums6));
//        System.out.println(searchLinear(nums6, 99));


        System.out.println(binarySearch(nums6, 75)) ;











    }


    public static void infoArraySelection (int[] array) {
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void infoArray (int[] array) {
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
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

        public static void sort (int [] array) {
        for (int i = 0; i < array.length-1; i++) {
            for( int j = array.length-1; j>i; j--) {
                if (array[j - 1] > array[j] ){
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] =tmp;
                }
            }
        }
        }

    public static void selectionSort (int[] array) {
        for (int i =0;i<array.length;i++){
            int pos = i;
            int min = array[i];
            for(int j = i +1;j<array.length;j++){
                if(array[j]< min){
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }

    }

    public static int searchLinear ( int[] array, int elementToSearch) {
            for ( int i = 0; i < array.length; i++){
                if (array[i] == elementToSearch) {
                    return i;
                }
            }
            return -1;
    }

//    public static int binarySearch (int[] array, int elementToSearch) {
//
//        int firstIndex =0;
//        int lastIndex = array.length-1;
//
//        while (firstIndex <= lastIndex) {
//            int middleIndex = (firstIndex + lastIndex) / 2;
//
//            if(array[middleIndex] == elementToSearch) {
//                return middleIndex;
//            }
//
//            else if(array[middleIndex] < elementToSearch ) {
//                firstIndex = middleIndex + 1;
//
//            }
//
//            else if (array[middleIndex] > elementToSearch ) {
//                lastIndex = middleIndex - 1;
//
//            }
//
//
//        }
//
//
//        return  -1;
//    }


        public static int binarySearch (int[] array, int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = array.length - 1;
         while (firstIndex <= lastIndex) {
             int middleIndex = (firstIndex + lastIndex) / 2;

             if (array[middleIndex] == elementToSearch){
                 return middleIndex;
             } else if (array[middleIndex] < elementToSearch) {
                 firstIndex = middleIndex + 1;
             } else if (array[middleIndex] > elementToSearch) {
                 lastIndex = middleIndex - 1;
             }


         }

        return -1;
        }























}
