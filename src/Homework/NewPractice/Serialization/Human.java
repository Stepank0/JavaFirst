package Homework.NewPractice.Serialization;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Human {
    public Cat cat;
    public Dog dog;


    public void save (PrintWriter printWriter) throws Exception {

        String isCatPresent = cat != null ? "yes" : "no";
        printWriter.write(isCatPresent);
        printWriter.flush();

        if (cat != null){ cat.save(printWriter);}

        String isDogPresent = dog != null ? "yes" : "no";
        printWriter.write(isDogPresent);
        printWriter.flush();

        if(dog != null) dog.save(printWriter);
    }

    public void load (BufferedReader reader) throws Exception {
        String isCatPresent = reader.readLine();
        if(isCatPresent.equals("yes")){
            cat = new Cat();
            cat.load(reader);
        }

        String isDogPresent = reader.readLine();
        if (isDogPresent.equals("yes")) {
            dog = new Dog();
            dog.load(reader);
        }


    }


}
