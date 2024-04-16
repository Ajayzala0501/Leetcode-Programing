package org.example.leetcode.string;

import java.util.*;
public class Minimum_String_Length_After_Removing_Substrings {

    public static int minLength(String s) {

        Stack<Character> inputStack = new Stack<>();
        for(char c : s.toCharArray()){
           if(c=='B'&& !inputStack.empty() && inputStack.peek()=='A'){
               inputStack.pop();
           } else if (c=='D'&& !inputStack.empty() && inputStack.peek()=='C') {
               inputStack.pop();
           }else {
               inputStack.push(c);
           }
        }
        return inputStack.size();
    }
}
