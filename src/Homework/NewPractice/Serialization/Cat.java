package Homework.NewPractice.Serialization;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Cat {

    public String name ;
    public int age;
    public int weight;



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

}
