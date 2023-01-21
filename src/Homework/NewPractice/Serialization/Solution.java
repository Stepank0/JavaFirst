package Homework.NewPractice.Serialization;

import java.io.*;

public class Solution  {


    public static void main(String[] args) {
        String filePath = "C:/Users/stepa/OneDrive/Рабочий стол/first.txt";

        Cat myCat = new Cat();
        myCat.name = "Barsik";
        myCat.age = 3;
        myCat.weight = 8;


        Human itsMe = new Human();
        itsMe.cat = myCat;

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath));
            PrintWriter writer = new PrintWriter(filePath)){
            itsMe.save(writer);

            Human itsYou = new Human();

            itsYou.load(reader);
            System.out.println(itsYou.cat.name);
            System.out.println(itsYou.cat.age);
            System.out.println(itsYou.cat.weight);


        } catch (Exception e){
            e.printStackTrace();
            System.out.println("something happens wrong");
        }


    }

}
