package org.example.leetcode.string;

import java.util.*;

public class Second_Largest_Digit_in_a_String {
    public static int secondHighest(String s) {
        List<Integer> list = new ArrayList<>();
            for(char c : s.toCharArray()){
                if(Character.isDigit(c)&&!list.contains(Integer.parseInt(String.valueOf(c)))){
                    list.add(Integer.parseInt(String.valueOf(c)));
                }
            }
        if(list.size()<=1)
            return -1;
        Collections.sort(list,Collections.reverseOrder());
        return list.get(1);

    }
}
