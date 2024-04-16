package org.example.leetcode.string;

import java.util.Stack;

public class Valid_Parentheses {
    public static boolean isValid(String s) {

        Stack<Character> inp = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                inp.push(c);
            }else {
                if(inp.size()>0&&(inp.peek()=='('&& c == ')'||inp.peek()=='{'&& c == '}'||inp.peek()=='['&& c == ']')){
                    inp.pop();
                }else {
                    return false;
                }
            }

        }
        return inp.size()==0?true:false;
    }
}
