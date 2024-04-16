package org.example.leetcode.string;

public class Find_First_Palindromic_String_in_the_Array {
    public static String firstPalindrome(String[] words) {

        for (String s:words){
            if(new StringBuilder(s).reverse().toString().equals(s)){
                return s;
            }
        }
        return "";
    }
}
