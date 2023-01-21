package Homework.NewPractice.InputOutputStream;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) throws IOException {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");

        String[] arr = {"sdf", "2"};

        for(String s : arr){

            try {
                int x = Integer.parseInt(s);

                if(map.containsKey(x)){
                    System.out.println(map.get(Integer.parseInt(s)));
                }
            } catch (NumberFormatException e) {

            }



        }


    }

    public static void forth() throws IOException{
        String first1 = "C:/Users/stepa/OneDrive/Рабочий стол/first.txt";
        String second2 = "C:/Users/stepa/OneDrive/Рабочий стол/second.txt";
        Path path1 = Paths.get("C:/Users/stepa/OneDrive/Рабочий стол/first.txt");
        Path path2 = Paths.get("C:/Users/stepa/OneDrive/Рабочий стол/second.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(path1.toFile()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(path2.toFile()));
        List<String> list = new ArrayList<>();

        while (fileReader.ready()){
            list.add(fileReader.readLine());
            int a = fileReader.read();
            fileWriter.write(a);
        }
        System.out.println(list.get(1));


        for (String s : list ){
            System.out.println(s);
        }
    }

    public static void changeSystemOut(){
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);

        printSomething();

        String result = outputStream.toString();

        System.setOut(consoleStream);

        StringBuilder text = new StringBuilder(result);

        text.reverse();

        String revers = text.toString();

        System.out.println(revers);
    }
    public static void printSomething(){
        System.out.println("Hi!");
        System.out.println("My name is Stefan.");
        System.out.println("What's your name?");

    }

    public static void  third(){
        String first = "C:/Users/stepa/OneDrive/Рабочий стол/first.txt";
        String second = "C:/Users/stepa/OneDrive/Рабочий стол/second.txt";

        ArrayList<String> text = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(first));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(second))){
            while (bufferedReader.ready()){
                text.add(bufferedReader.readLine());
            }

            for (String s : text){
                bufferedWriter.write(s);
            }


        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void second() throws IOException{
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
