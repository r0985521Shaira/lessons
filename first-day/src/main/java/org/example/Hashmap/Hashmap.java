package org.example.Hashmap;

import org.example.staticTest.PrintNumber5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");

        System.out.println(Arrays.asList(map));

        ArrayList<String> letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");

        for (int i = 0; i <= letters.size(); i++) {
            System.out.println(letters.get(i));
        }
    }
}
