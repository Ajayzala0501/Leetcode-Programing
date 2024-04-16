package org.example.leetcode.string;

public class Reverse_Words_in_a_String_III {
    public static String reverseWords(String s) {

        String[] inp = s.split(" ");
        StringBuilder mainString = new StringBuilder();
        for(int i=0; i<inp.length;i++){
            StringBuilder sb = new StringBuilder(inp[i]);
            mainString.append(sb.reverse());
            mainString.append(" ");
        }
        return mainString.subSequence(0,mainString.length()-1).toString();
    }
}
