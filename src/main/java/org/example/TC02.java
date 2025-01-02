package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TC02 {
    public static void main(String[] args) {
        String str = "Komrelly Srinivas Reddy";
        HashMap<Character, Integer> dups = new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c : ch) {
            if(dups.containsKey(c)) {
                dups.put(c, dups.get(c) + 1);
            }else {
                dups.put(c, 1);
            }
        }
        Set<Character> keys = dups.keySet();
        for(Character key : keys) {
            if(dups.get(key) > 1) {
                System.out.println(key + "  is " + dups.get(key) + " times");
            }
        }
    }
}
