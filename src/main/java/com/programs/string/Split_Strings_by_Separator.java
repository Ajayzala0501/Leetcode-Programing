package org.example.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Split_Strings_by_Separator {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> inp = new ArrayList<>();

        for (String inpStr : words){
            String[] spitData = inpStr.split("["+separator+"]");
            for (String inner : spitData){
                if(inner.length()>0){
                    inp.add(inner);
                }
            }
        }
        return inp;
    }
}
