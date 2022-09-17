package Homework.NewPractice.Mapa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class practiceMap {


    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "second");
        map.put(3, "third");

//        mapPract(map);





    }

    public static void mapPract(Map<Integer, String> map){

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println("---------");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }
}
