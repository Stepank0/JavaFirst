package Homework.NewPractice.Person;

public class Main {

    public static void main(String[] args) {


        Person Ivan = new Person ("Ivan Ivanov", 34);
        Person Diman = new Person();
        System.out.println(Ivan.getFullName() + " " + Ivan.getAge());

        Ivan.move();
        Ivan.talk();
        Diman.move();
    }
}
