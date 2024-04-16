package org.example.leetcode.string;

public class Truncate_Sentence {
    public static String truncateSentence(String s, int k) {
            String inp[] = s.split(" ");
            StringBuilder res = new StringBuilder();
            for(int i=0; i<k;i++){
                res.append(inp[i]+" ");
            }
        return res.toString().substring(0, res.length()-1);
    }
}
