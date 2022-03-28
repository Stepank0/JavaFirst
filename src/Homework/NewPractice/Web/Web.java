package Homework.NewPractice.Web;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Web {

    public static void main(String[] args) throws IOException {
//        something();








    }

    public static void something() throws IOException {
        System.out.println(InetAddress.getLocalHost());
        System.out.println(InetAddress.getLocalHost().getHostName());
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        System.out.println(InetAddress.getByName("google.com"));
        Arrays.stream(InetAddress.getAllByName("google.com")).forEach(System.out::println);

        try(Socket socketGoogle = new Socket(InetAddress.getByName("google.com"), 8099);
            InputStream inputStream = socketGoogle.getInputStream();
            OutputStream outputStream = socketGoogle.getOutputStream()) {

            byte[] bytes = "Bla bla bla for google".getBytes();
            outputStream.write(bytes);
            outputStream.flush();
            int answer = 0;
            while ((answer = inputStream.read())!=-1){

            }
        }

    }
}
