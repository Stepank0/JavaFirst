package Homework.NewPractice.InputOutputStream;

import java.io.*;

public class readerAndWriter {

    public static String src = "JavaFirst/resources/test1.csv";
    public static String dest = "JavaFirst/resources/testCopyForWriter.csv";
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader(src);
             FileWriter fileWriter = new FileWriter(dest))
        {
            char[] buffer = new char[65536];
            while (fileReader.ready()){
                int read = fileReader.read(buffer);
                fileWriter.write(buffer, 0, read);
            }

        }catch (IOException e){
            System.out.println("Something wrong : " + e);
        }

    }
}
