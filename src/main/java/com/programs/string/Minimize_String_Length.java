package org.example.leetcode.string;

import java.util.ArrayList;
public class Minimize_String_Length {

    public static int minimizedStringLength(String s) {
        ArrayList<Character> checkList = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if(!checkList.contains(s.charAt(i))){
                checkList.add(s.charAt(i));
            }
        }
        return checkList.size();
    }
}
