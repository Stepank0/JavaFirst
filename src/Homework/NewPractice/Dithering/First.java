package Homework.NewPractice.Dithering;

import java.io.*;

public class First {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Olga").append("\n");
        sb.append("Helena").append("\n");
        sb.append("Vera").append("\n");
        String data = sb.toString();

        InputStream is = new ByteArrayInputStream(data.getBytes());

        System.setIn(is);
        readAndPrint();

    }

    public static void readAndPrint(){
        try(InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);) {

            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                System.out.println(line);
            }
        } catch (IOException e ){
            e.printStackTrace();
        }



    }
}
