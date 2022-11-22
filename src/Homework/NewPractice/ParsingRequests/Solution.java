package Homework.NewPractice.ParsingRequests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution  {

    public static void main(String[] args) throws IOException {

        // URL : http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
        // URL : http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String URL = reader.readLine();

        String lineSubString = URL.substring(URL.lastIndexOf("?")+1);
        String [] stringParams = lineSubString.split("&");
        String objValue = null;

        StringBuilder resultBuilder = new StringBuilder();
        for(String stringParam : stringParams){
            String [] paramAndValue = stringParam.split("=");
            resultBuilder.append(paramAndValue[0]);
            resultBuilder.append(" ");


            if(paramAndValue[0].equals("obj")){
                objValue = paramAndValue[1];
            }
        }

        System.out.println(resultBuilder.toString().trim());

        if(objValue != null){
            try {
                alert(Double.parseDouble(objValue));
            } catch (NumberFormatException e) {
                alert(objValue);
            }
        }


    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

}
