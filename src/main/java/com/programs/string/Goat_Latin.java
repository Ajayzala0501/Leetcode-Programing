package org.example.leetcode.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Goat_Latin {
    public static String toGoatLatin(String sentence) {
        String vowel = "aeiouAEIOU";
        String[] array = sentence.split(" ");
        for(int i=0;i<array.length;i++){
            String inp = array[i];
            if(vowel.contains( String.valueOf(inp.charAt(0)))){
                inp = inp+"ma";
            }else {
                inp =  inp.substring(1,inp.length())+inp.charAt(0)+"ma";
            }

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j<=i;j++){
                sb.append("a");
            }
            array[i] = inp+sb.toString();
        }
        return String.join(" ", array);
    }
}
