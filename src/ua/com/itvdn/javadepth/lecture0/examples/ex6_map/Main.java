package ua.com.itvdn.javadepth.lecture0.examples.ex6_map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", 100);
        map.put("Hello", 200);
        System.out.println("size = " + map.size() + "\nMap: " + map);

        map.put("word1", 200);
        map.put("word2", 300);
        map.put("word3", 400);

        /*
        map.put(null, 400);
        map.put("word4", null);
        map.put(null, null);
         */

        for(Map.Entry<String, Integer> item : map.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }

    }
}
