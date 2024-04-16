package org.example.leetcode.string;

public class Is_Subsequence {
    public static boolean isSubsequence(String s, String t) {

        if(s.length()==0)
            return true;
        int temp=0;
        for (int i=0; i<t.length();i++){
            if(s.charAt(temp)==t.charAt(i)){
                temp++;
            }
            if(temp == s.length()){
                return true;
            }
        }
        return false;
    }
}
