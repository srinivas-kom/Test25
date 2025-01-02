package org.example;

import java.util.HashMap;
import java.util.Set;

public class TC03 {
    public static void main(String[] args) {
        String str = "Komrelly Srinivas Reddy K";
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        for(char c : ch) {
           if(hmap.containsKey(c)) {
               hmap.put(c, hmap.get(c) + 1);
           }else {
               hmap.put(c, 1);
           }
        }
        Set<Character> set = hmap.keySet();
        for(Character c : set) {
            if(hmap.get(c) > 1) {
                System.out.println(c + "  is " + hmap.get(c) + " times");
            }
        }
    }
}
