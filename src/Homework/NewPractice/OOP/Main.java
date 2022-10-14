package Homework.NewPractice.OOP;

public class Main {

    public static void main(String[] args) {

        Cat firstCat = new Cat("Sasha", 5, "black");
        System.out.println(firstCat.getName());
        Cat simpleCat = new Cat();
        System.out.println(simpleCat.getName());
    }
}
