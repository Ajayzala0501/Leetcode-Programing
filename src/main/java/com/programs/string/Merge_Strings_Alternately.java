package org.example.leetcode.string;

public class Merge_Strings_Alternately {
    public static String mergeAlternately(String word1, String word2) {
        int len  =  Math.min(word1.length(),word2.length());
       StringBuilder sb =new StringBuilder();
        for(int i =0; i<len;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        return sb.append(word1.length()>word2.length()?word1.substring(len,word1.length()):word2.substring(len,word2.length())).toString();
    }
}
