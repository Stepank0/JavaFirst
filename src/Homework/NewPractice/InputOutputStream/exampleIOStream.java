package Homework.NewPractice.InputOutputStream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class exampleIOStream {
    public static String src = "JavaFirst/resources/test1.csv";
    public static String dest = "JavaFirst/resources/test1Copy.csv";

    public static void main(String[] args) {



    }

    public static void secondTask(){
    try(Scanner scanner = new Scanner(System.in);
        InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
        OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
    ){
        byte[] bytesIn = new byte[64999];
        while (inputStream.available() > 0){
            int read = inputStream.read(bytesIn);
            outputStream.write(bytesIn, 0, read);
        }
        

    }catch (IOException e){
        System.out.println("Something wrong : " + e);
    }
    }

    public static void firstTask(){
        try(FileInputStream input = new FileInputStream(src);
            FileOutputStream output = new FileOutputStream(dest)){
            byte[] buffer = new byte[65536];
            while (input.available() > 0){
                int real = input.read(buffer);
                output.write(buffer, 0, real);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
