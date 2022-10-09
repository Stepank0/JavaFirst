package Homework.NewPractice.Date;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class FirstTask {
    public static final String pathOfBook = "C:\\Users\\stepa\\OneDrive\\Рабочий стол\\childrenBook.txt";
    public static final String pathOfFile = "C:\\Users\\stepa\\OneDrive\\Рабочий стол\\JavaFirst\\JavaFirst\\resources\\hellow.txt";
    public static void main(String[] args){

//        byCountingTime();
//        Date current = new Date();
//        System.out.println(current.getTime());
//        Date current1 = new Date(122, 9, 10, 23, 15, 50);
//        System.out.println(current1);

        readFile();



    }

    public static void byCountingTime() {

        try {
            Date date = new Date();

            InputStream input = Files.newInputStream(Paths.get(pathOfBook));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(input, 200);

            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                System.out.print((char) i);
            }

            Date date1 = new Date();

            System.out.println(date1.getTime() - date.getTime() + " <- time");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile(){
        Date date = new Date();
        try (InputStream input = Files.newInputStream(Paths.get(pathOfBook));
             OutputStream output = Files.newOutputStream(Paths.get(pathOfFile));
             BufferedInputStream buffer = new BufferedInputStream(input, 200);
             PrintStream printStream = new PrintStream(output)){

            int data;
            while((data = buffer.read()) != -1){
                output.write(data);
            }
//            while(input.available() > 0){
//                 int data = input.read();
//                 output.write(data);
//            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Date date1 = new Date();

        System.out.println(date1.getTime() - date.getTime() + " <- time");



//        OutputStream output = Files.newOutputStream(
//                Paths.get());

    }
}
