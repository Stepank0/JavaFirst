package Homework.NewPractice.Person;

public class Main {

    public static void main(String[] args) {


        Person Ivan = new Person ("Ivan 1", 34);
        Person Stepan = new Person ("Ivan 2", 34);
        Person Sash = new Person ("Ivan 3", 34);
        Person Vanya = new Person ("Ivan 4", 34);
        Person Diman = new Person();
        System.out.println(Ivan.getFullName() + " " + Ivan.getAge());

        Ivan.move();
        Ivan.talk();
        Diman.move();

        Diman.sayHi(Ivan.getFullName(), Stepan.getFullName(), Sash.getFullName(), Vanya.getFullName());



    }
}
