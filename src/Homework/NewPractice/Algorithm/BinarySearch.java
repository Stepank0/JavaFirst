package Homework.NewPractice.Algorithm;


import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число 1 если хотите использовать массив или 2 если хотите использовать Коллекцию");

        while (scanner.hasNextInt()){
            int choice = scanner.nextInt();
            if (choice == 1) {
                array();
            } else if (choice == 2) {
                arrList();
            } else{
                System.out.println("Введите число 1 или 2 !!!11!!");
            }
        }

    }
    public static void array(){

        System.out.println("Введите число ктотрое хотите найти в массиве чисел от 1 до 100 включительно");
        int elementToSearch = scanner.nextInt();
        int[] array = new int[100];
        for( int i = 0; i < array.length; i++){
            array[i] = i+1;
        }
        try{
            System.out.println(" за " + search(elementToSearch, array) + " шагом мы нашли это число");
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Число больше чем 100");
        }


    }
    public static void arrList(){
        System.out.println("Введите максимально количество коллекции в котором будем искать ваше число ");
        int lastIndexForList = scanner.nextInt();
        System.out.println("Введите число ктотрое хотите найти в массиве чисел от 1 до" + lastIndexForList + " включительно");
        int elementToSearchForList = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i <= lastIndexForList; i++){
            arrayList.add(i+1);
        }
        try{
            System.out.println(" за " + searchList(elementToSearchForList, arrayList) + " шагом мы нашли это число");
        }
        catch (IndexOutOfBoundsException exp){
            System.out.println("Число больше чем " + lastIndexForList);
        }


//        for (Integer s : arrayList){
//            System.out.println(s);
//        }

    }

    public static int search (int elementToSearch, int[] array){
        int firstIndex = 0;
        int lastIndex = array.length;
        int i = 0;

        while (firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex) / 2;
            if( array[middleIndex] == elementToSearch){
                return middleIndex;
            } else if( array[middleIndex] > elementToSearch ){
                lastIndex = array[middleIndex] - 1;
            } else if (array[middleIndex] < elementToSearch){
                firstIndex = array[middleIndex] + 1;
            } else {
                return -1;
            }

            System.out.println(" количество шагов = " + ++i );

        }

        return i;
    }


    public static int searchList (int elementToSearch, ArrayList list){
        int firstIndex = 0;
        int lastIndex = list.size();
        int i = 0;
        while (firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex) / 2;
            if ( (int)list.get(middleIndex) == elementToSearch){
                return middleIndex;
            } else if ((int)list.get(middleIndex) > elementToSearch){
                lastIndex = (int)list.get(middleIndex) - 1;
            } else if ((int)list.get(middleIndex) < elementToSearch){
                firstIndex = (int)list.get(middleIndex) +1;
            } else {
                return  -1;
            }
            System.out.println("Шагов для поиска числа = " + ++i );
        }
        return i;
    }
}
