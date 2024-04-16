package org.example.leetcode.string;

import java.util.HashMap;

public class First_Letter_to_Appear_Twice {
    public static char repeatedCharacter(String s) {

        char c = ' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            if(map.get(s.charAt(i))==2) return s.charAt(i);
        }
        return c;
    }
}
