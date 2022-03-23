package Homework.NewPractice;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PracticeFile  {

    public static void main(String[] args) throws IOException {
        File fileCSV = new File("C:/Users/stepa/OneDrive/Рабочий стол/Java/test.csv");

//        System.out.println(fileCSV.getName());
//        System.out.println(fileCSV.exists());
//        System.out.println(fileCSV.isFile());
//        System.out.println(fileCSV.isDirectory());

        File directoryCSV = new File("C:/Users/stepa/OneDrive/Рабочий стол/Java");


        System.out.println(directoryCSV.getName());
        System.out.println(directoryCSV.exists());
        System.out.println(directoryCSV.isDirectory());

        for (String str: directoryCSV.list()){
            System.out.println("file name " + str);
        }

        FileInputStream fi = null;
        try{
            fi = new FileInputStream(fileCSV);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } finally {
            fi.close();
        }

//        byte[] bytes = new String( "My string in bytes").getBytes();
//
//        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
//            int x;
//            while ((x = byteArrayInputStream.read()) != -1){
//                System.out.print(x + " ");
//                byteArrayOutputStream.write(x);
//            }
//
//            byte[] arr = byteArrayOutputStream.toByteArray();
//
//        }

        ByreArray();

    }

    public static void ByreArray (){

        byte[] arr = {65, 66, 67};
        ByteArrayInputStream in = new ByteArrayInputStream(arr);
        int x ;
        while ((x = in.read()) !=-1){
            System.out.print(x + " ");
        }
    }
}

