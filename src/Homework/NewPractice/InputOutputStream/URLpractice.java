package Homework.NewPractice.InputOutputStream;


import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class URLpractice {

    public static URL url = null;

    public static void main(String[] args) {

//        getDOMpage("https://javarush.ru");
//        createTempFile("");
        downloadPictureFromGoogle();


    }

    public static void downloadPictureFromGoogle(){
        String image = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png";
        try{
            url = new URL(image);
            InputStream reader = url.openStream();

            Path path = Paths.get("C:\\Users\\stepa\\OneDrive\\Рабочий стол\\google.png");
            Files.copy( reader, path);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void createTempFile(String link){

        try {
            url = new URL(link);
            InputStream input = url.openStream();

            byte[] buffer = IOUtils.toByteArray(input);
            Path resource = Files.createFile(Paths.get("C:\\Users\\stepa\\OneDrive\\Рабочий стол\\JavaFirst\\JavaFirst\\resources\\hellow.txt"));
            Files.write(resource, buffer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void getDOMpage(String urlPage)
    {
        try {
            url = new URL( urlPage);
            InputStream input = url.openStream();

            byte[] buffer = IOUtils.toByteArray(input);
            String str = new String(buffer);
            System.out.println(str);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
