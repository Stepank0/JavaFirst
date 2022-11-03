package Homework.NewPractice.InputOutputStream.someone;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFromConsole {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            // reads the file path from the console
            // JavaFirst/resources/my-object-data.txt
            String filePath = reader.readLine();

            BufferedWriter writer = new BufferedWriter(Files.newBufferedWriter(Paths.get(filePath)));

            StringBuilder builder = new StringBuilder();
            String str = "";
            while (!str.equals("exit")){
                str = reader.readLine();
                builder.append(str).append("\n");
            }

            writer.write(builder.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
