package Homework.HWJavaCore3;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayMain {

    public static void main(String[] args) {

        ArrayList<Orange> orangesList1 = new ArrayList<>(10);

        Orange orange1 = new Orange(1.5f, "Апельсинка");
        orangesList1.add(orange1);
        Orange orange2 = new Orange(1.5f, "Апельсинка");
        orangesList1.add(orange2);
        Orange orange3 = new Orange(1.5f, "Апельсинка");
        orangesList1.add(orange3);
        Orange orange4 = new Orange(1.5f, "Апельсинка");
        orangesList1.add(orange4);
        Orange orange5 = new Orange(1.5f, "Апельсинка");
        orangesList1.add(orange5);
        Box<Orange> box1 = new Box<>(orangesList1);

        ArrayList<Orange> orangesList2 = new ArrayList<>(10);

        orangesList2.add(orange1);
        orangesList2.add(orange2);
        orangesList2.add(orange3);
        orangesList2.add(orange4);
        orangesList2.add(orange5);
        Orange orange6 = new Orange(1.5f, "Апельсинка");
        orangesList2.add(orange6);

        Box<Orange> box2 = new Box<>(orangesList2);

        ArrayList<Apple> applesList = new ArrayList<>(10);

        Apple apple1 = new Apple(1.0f, "Яблочки");
        applesList.add(apple1);
        Apple apple2 = new Apple(1.0f, "Яблочки");
        applesList.add(apple2);
        Apple apple3 = new Apple(1.0f, "Яблочки");
        applesList.add(apple3);
        Apple apple4 = new Apple(1.0f, "Яблочки");
        applesList.add(apple4);
        Apple apple5 = new Apple(1.0f, "Яблочки");
        applesList.add(apple5);
        Apple apple6 = new Apple(1.0f, "Яблочки");
        applesList.add(apple6);

        Box<Apple> box3 = new Box<>(applesList);

        System.out.println("Вес первой коробки с Апельсинками > " + box1.getSumBoxList());
        System.out.println("Вес второй коробки с Апельсинками > " + box2.getSumBoxList());
        System.out.println("Вес третьей коробки с Яблочками > " + box3.getSumBoxList());


    }
}
