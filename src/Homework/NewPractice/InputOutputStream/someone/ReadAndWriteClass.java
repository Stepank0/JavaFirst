package Homework.NewPractice.InputOutputStream.someone;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAndWriteClass
{

    public static void main(String[] args) throws IOException
    {

        MyClass myObject = new MyClass();
        Path path = Paths.get("JavaFirst/resources/my-object-data.txt");
        OutputStream outStream = Files.newOutputStream(path);

        while (myObject.available() > 0){
            int data = myObject.read();
            outStream.write(data);
        }

        outStream.close();

        InputStream inStream = Files.newInputStream(path);

        while (inStream.available() > 0)
        {
            int data = inStream.read();
            myObject.write(data);
        }

        inStream.close();


    }
}
