package org.example.leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Buddy_Strings {
    public static boolean buddyStrings(String s, String goal) {

        if(s.length()!=goal.length())
            return false;
        ArrayList<Integer> ind = new ArrayList<>();
        StringBuilder sb =  new StringBuilder(s);

        if(s.equals(goal)){
            Set<Character> temp = new HashSet<>();
            for (char c : s.toCharArray()) {
                temp.add(c);
            }
            return temp.size() < goal.length();
        }else {
            for(int i=0; i<s.length();i++){
                if(s.charAt(i)!=goal.charAt(i)){
                    ind.add(i);
                }
            }

            if(ind.size()==2){
                sb.setCharAt(ind.get(0),s.charAt(ind.get(1)));
                sb.setCharAt(ind.get(1),s.charAt(ind.get(0)));
            }

            return sb.toString().equals(goal);
        }

    }
}
