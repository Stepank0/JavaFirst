package Homework.NewPractice.InputOutputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferReaderTask {

    public static String src = "JavaFirst/resources/testText.txt";

    public static void main(String[] args)
    {
        try(FileReader in = new FileReader(src);
            BufferedReader buff = new BufferedReader(in)){
            while (buff.ready()){
                String line = buff.readLine();
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println("Something wrong : " + e);
        }

    }
}
