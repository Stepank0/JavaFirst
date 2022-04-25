package Homework.NewPractice.StreamAPI;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Person {

    enum Position{
        ENGINEER, DIRECTOR, MANAGER;
    }

    private String name;
    private int age;
    private Position position;

    public Person(String name, int age, Position position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    private static void streamSimpleTask(){

        List<Person> persons = new ArrayList<>(Arrays.asList(
                new Person("Bob", 34, Person.Position.ENGINEER),
                new Person("Som", 56, Person.Position.DIRECTOR),
                new Person("Mat", 45, Person.Position.MANAGER),
                new Person("Brat", 22, Person.Position.ENGINEER),
                new Person("Aleart", 49, Person.Position.MANAGER),
                new Person("Tat", 33, Person.Position.ENGINEER),
                new Person("Helen", 29, Person.Position.ENGINEER)
        ));

        List<String> engineerNames = persons.stream()
                .filter(person -> person.position == Person.Position.ENGINEER)
                .sorted((o1, o2) -> o1.age - o2.age)
                .map((Function<Person, String>) person -> person.name)
                .collect(Collectors.toList());
        System.out.println(engineerNames);



    }

    public static void main(String[] args) {
//        streamSimpleTask();

        IntStream randeSream = IntStream.rangeClosed(1,100);
        randeSream.reduce((i1 , i2) -> i1>i2?i1:i2)
                .ifPresent(System.out::println);


//
//        randeSream.forEach(rag -> System.out.println(rag));
        Stream<Integer> stream = Stream.of(1,2,3,5,8,12,56,1,34,5);
        stream.filter(n -> n%2==0).forEach(System.out::println);
//        stream.reduce((i1, i2) -> i1 > i2 ? i1 : i2)
//                .ifPresent(System.out::println);

        Stream.of("a", "a", "b", "b", "b")
                .distinct()
                .forEach(System.out::println);

        Stream<String> stringStream = Stream.of("asda", "wewewe", "as", "difgaadsf");
        stringStream.map(str -> str.length()).forEach(System.out::println);

        Stream<Integer> stream2 = Stream.of(1,2,3,5,8,12,56,1,34,5)
                .limit(5);











    }
}
