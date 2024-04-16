package org.example.leetcode.string;

public class Find_the_Difference {
    public static char findTheDifference(String s, String t) {
        char temp  = ' ';
        for (char c : t.toCharArray()){
            if(!s.contains(""+c)){
                temp = c;
                break;
            }
        }

        return temp;
    }
}
