package org.example.leetcode.string;

import java.util.HashMap;

public class Word_Pattern {
    public static boolean wordPattern(String pattern, String s) {


        String []inp = s.split(" ");
        if(pattern.length()!=inp.length){
            return false;
        }
        HashMap<Character,String> map =  new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))&&!map.containsValue(inp[i])){
                map.put(pattern.charAt(i),inp[i]);
            }
        }
        String s1 = "";
        for(char c : pattern.toCharArray()){
            s1+=map.get(c)+" ";
        }
        return s.equals(s1.substring(0,s1.length()-1));
    }
}
