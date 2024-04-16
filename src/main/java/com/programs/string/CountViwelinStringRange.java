package org.example.leetcode.string;

public class CountViwelinStringRange {
    public static int vowelStrings(String[] words, int left, int right) {
        int count =0;
        String vowelString = "aeiou";
        for (int i =0; i<words.length;i++){
                if(i>=left && i<=right){
                    if(vowelString.contains(String.valueOf(words[i].charAt(0))) && vowelString.contains(String.valueOf(words[i].charAt(words[i].length()-1)) )){
                        count++;
                    }
                }
            }
        return count;
    }
}
