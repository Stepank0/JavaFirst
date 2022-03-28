package Homework.NewPractice;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PracticeFile  {

    public static void main(String[] args) throws IOException {

        File fileCSV = new File("C:/Users/stepa/OneDrive/Рабочий стол/JavaFirst/JavaFirst/resources/test1.csv");

        System.out.println(fileCSV.getName());
        System.out.println(fileCSV.exists());
        System.out.println(fileCSV.isFile());
        System.out.println(fileCSV.isDirectory());

        File directoryCSV = new File("C:/Users/stepa/OneDrive/Рабочий стол/JavaFirst/JavaFirst/resources");


        System.out.println(directoryCSV.getName());
        System.out.println(directoryCSV.exists());
        System.out.println(directoryCSV.isDirectory());

        for (String str: directoryCSV.list()){
            System.out.println("file name " + str);
        }
//      --------------------------------------------------------------------------------------
        FileInputStream fi = null;
        try{
            fi = new FileInputStream(fileCSV);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } finally {
            fi.close();
        }
//      --------------------------------------------------------------------------------------
        int i;
        File resultCSV = new File("C:/Users/stepa/OneDrive/Рабочий стол/JavaFirst/JavaFirst/resources/result.csv");
        try(FileInputStream fileInputStream = new FileInputStream(fileCSV);
        FileOutputStream fileOutputStream = new FileOutputStream(resultCSV);){
            do{
                i=fileInputStream.read();
                System.out.print((char) i);
                fileOutputStream.write(i);
            } while ( i !=-1);
        }


//      --------------------------------------------------------------------------------------

        byte[] bytes = new String( "My string in bytes").getBytes();

        try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();){
            int x;
            while ((x = byteArrayInputStream.read()) != -1){
                System.out.print(x + " ");
                byteArrayOutputStream.write(x);
            }

            byte[] arr = byteArrayOutputStream.toByteArray();
        }
//      --------------------------------------------------------------------------------------
        System.out.println("--------------------------------------");
//        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(
//                new FileInputStream("C:/Users/stepa/OneDrive/Рабочий стол/JavaFirst/JavaFirst/resources/demo.txt"));
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
//                new FileOutputStream("C:/Users/stepa/OneDrive/Рабочий стол/JavaFirst/JavaFirst/resources/demo.txt"))) {
//
//            for ( int j =0; j < 10000 ; j++ ){
//                bufferedOutputStream.write(j);
//            }
//            int x;
//            while ((x = bufferedInputStream.read()) != -1) {
//                System.out.print((char) x);
//            }
//        }
//        System.out.println();
//      --------------------------------------------------------------------------------------
        try(DataInputStream dataInputStream = new DataInputStream( new FileInputStream("JavaFirst/resources/demo2.txt"));
        DataOutputStream dataOutputStream = new DataOutputStream( new FileOutputStream("JavaFirst/resources/demo2.txt"))){
            dataOutputStream.writeInt(123);
            dataOutputStream.writeLong(128L);
            dataOutputStream.writeUTF("string");
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readUTF());

        }
        System.out.println();
       System.out.println("--------------------------------------");
//      --------------------------------------------------------------------------------------








    }


}

