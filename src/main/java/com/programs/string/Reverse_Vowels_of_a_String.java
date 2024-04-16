package org.example.leetcode.string;

public class Reverse_Vowels_of_a_String {
    public static String reverseVowels(String s) {

       // "leetcode"
        String vowel = "aeiouAEIOU";
        StringBuilder s1 =  new StringBuilder(s);
        int l = 0;
        int r = s1.length()-1;
        while (l<r){
            while (l<r&& !vowel.contains(""+s1.charAt(l))){
                l++;
            }
            while (l<r&& !vowel.contains(""+s1.charAt(r))){
                r--;
            }
            s1.setCharAt(l,s.charAt(r));
            s1.setCharAt(r,s.charAt(l));
            l++;
            r--;
        }
        return s1.toString();
    }
}
