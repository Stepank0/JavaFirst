package Homework.NewPractice.Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorPractice {

    public static ArrayList<Cat> cats = new ArrayList<>();
    public static Iterator<Cat> catIterator;

    public static void main(String[] args) {

        Cat barsic = new Cat("Barsic");
        Cat tarsic = new Cat("Tarsic");
        Cat totsha = new Cat("Totosha");
        Cat mike = new Cat("Mike");
        Cat sasha = new Cat("Sasha");

        cats.add(barsic);
        cats.add(tarsic);
        cats.add(totsha);
        cats.add(mike);
        cats.add(sasha);

        printList(cats);
        catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            Cat catNext = catIterator.next();
            if (catNext.getName().equals("Mike")) {
                catIterator.remove();
            }

        }
        printList(cats);
    }


    public static void printList(ArrayList<Cat> cats) {
        catIterator = cats.iterator();
        while (catIterator.hasNext()) {
            Cat catNext = catIterator.next();
            System.out.println(catNext.getName());
        }
    }
}


