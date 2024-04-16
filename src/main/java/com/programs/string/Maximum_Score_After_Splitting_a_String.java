package org.example.leetcode.string;

public class Maximum_Score_After_Splitting_a_String {
    public static int maxScore(String s) {

        int max = 0;
        for(int i=0;i<s.length()-1;i++){
            String left = s.substring(0,i+1);
            String right = s.substring(i+1,s.length());
            int sum = left.replaceAll("1","").length() + right.replaceAll("0","").length() ;
            max = sum > max ? sum : max;


        }
        return max;
    }
}
