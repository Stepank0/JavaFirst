package Homework.NewPractice.File;

import java.io.*;

public class WRClass {

    public static void main(String[] args) {

        try (BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter("JavaFirst/resources/demo3.txt"))) {
            for ( int i = 0; i < 20 ; i++) {
                bufferedWriter.write("It is my String №" + i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader( new FileReader("JavaFirst/resources/demo3.txt"))) {
            String str;
            while ((str = bufferedReader.readLine()) !=null){
                System.out.println(str);
            }
        }catch ( IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("===================================");




//        try(RandomAccessFile randomAccessFile = new RandomAccessFile("JavaFirst/resources/demo3.txt", "r")) {
//            for ( int i = 10; i < 50; i++){
//                randomAccessFile.seek(i);
//                System.out.print((char) randomAccessFile.read());
//            }
//        } catch ( IOException e ){
//            e.printStackTrace();
//        }







    }
}
