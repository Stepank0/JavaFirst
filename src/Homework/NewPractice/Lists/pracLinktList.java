package Homework.NewPractice.Lists;

import java.util.LinkedList;

public class pracLinktList {
    public static final LinkedList<String> storage = new LinkedList<>();
    public static void main(String[] args) {
        push("as");
        push("aes");

        print(storage);
        push("asr");
        push("ast");

        print(storage);
        System.out.println(pop() + " <-");
        print(storage);
        System.out.println(search("s"));


    }
    public static void push(String s){
        storage.add(0,s);

    }
    public static void print(LinkedList<String> storage){
        for(String s : storage){
            System.out.println(s);
        }
        System.out.println("------------------ ");
    }
    public static String pop() {
        //напишите тут ваш код
        String getWord =  storage.get(0);
        storage.remove(0);
        return getWord;
    }

    public static String peek() {
        //напишите тут ваш код
        return storage.get(0);
    }

    public static boolean empty() {
        //напишите тут ваш код
        return storage.isEmpty();
    }

    public static int search(String s) {
        //напишите тут ваш код
        return storage.indexOf(s);
    }

}
