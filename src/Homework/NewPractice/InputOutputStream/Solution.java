package Homework.NewPractice.InputOutputStream;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
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
