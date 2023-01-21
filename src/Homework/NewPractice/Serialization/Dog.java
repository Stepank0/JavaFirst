package Homework.NewPractice.Serialization;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Dog {
    private String name ;
    private int age;
    private int weight;


    public void save (PrintWriter printWriter) throws Exception{
        printWriter.write(name);
        printWriter.write(age);
        printWriter.write(weight);
        printWriter.flush();
    }

    public void load (BufferedReader reader)  throws Exception {
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        weight = Integer.parseInt(reader.readLine());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
