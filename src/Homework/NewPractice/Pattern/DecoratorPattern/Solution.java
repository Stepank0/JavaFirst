package Homework.NewPractice.Pattern.DecoratorPattern;

public class Solution {

    public static void main(String[] args) {
        Cat cat = new Cat("Koshak");
        CatWrapper wrapper = new CatWrapper(cat);

        printName(cat);
        printName(wrapper);
        cat.setName("Васька");
        printName(cat);
        printName(wrapper);
        wrapper.setName("Кошак");
        printName(cat);
        printName(wrapper);
    }

    public static void printName(Cat named)
    {
        System.out.println(named.getName());
    }
}
