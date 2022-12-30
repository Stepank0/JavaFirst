package Homework.NewPractice.InputOutputStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = "C:/Users/stepa/OneDrive/Рабочий стол/vav.txt";

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int count = 0;
        while (reader.ready()){
            for(char symbol : reader.readLine().toCharArray()){
                if((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')){
                    count ++;
                }
            }
        }
        reader.close();
        System.out.println(count);



    }

    public static void first(){
        String something = "Привет! Меня зовут Амиго!\nЯ изучаю Java на сайте JavaRush.\nОднажды я стану крутым программистом!\n";
        byte[] arrByte = something.getBytes();

        InputStream is = new ByteArrayInputStream(arrByte);
        System.setIn(is);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;

        try {
            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
