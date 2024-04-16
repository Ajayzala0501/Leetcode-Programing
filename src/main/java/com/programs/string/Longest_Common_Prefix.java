package org.example.leetcode.string;

public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length<1){
            return "";
        }
        StringBuilder res =  new StringBuilder();
        String word = strs[0];
        for(int i = 0;i<word.length();i++){
            int count = 0;
            for(int j = 1;j<strs.length;j++){
                if(i<strs[j].length()){
                    if(strs[j].charAt(i)==word.charAt(i)){
                        count++;
                    }
                }
            }
            if(count == strs.length-1){
                res.append(word.charAt(i));
            }else {
                return res.toString();
            }
        }
        return res.toString();
    }
}
