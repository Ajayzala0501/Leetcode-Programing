package org.example.leetcode.string;

public class Maximum_Number_of_Words_Found_in_Sentences {
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences){
           String[] len =  s.split(" ");
           if(max<len.length)
           {
               max = len.length;
           }
        }
        return max;
    }
}
