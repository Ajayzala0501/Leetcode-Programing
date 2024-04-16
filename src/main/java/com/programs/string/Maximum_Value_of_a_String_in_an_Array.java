package org.example.leetcode.string;

import java.util.Arrays;

public class Maximum_Value_of_a_String_in_an_Array {
    public static int maximumValue(String[] strs) {
    int max = 0;
        for(int i=0; i<strs.length;i++){
            try {
               max =  Integer.parseInt(strs[i]) > max ? Integer.parseInt(strs[i]) : max;

            } catch(NumberFormatException e){
                max =  strs[i].length() > max ? strs[i].length() : max;
            }
        }
    return  max;
    }
}
