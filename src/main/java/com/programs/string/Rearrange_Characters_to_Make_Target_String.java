package org.example.leetcode.string;

import java.util.ArrayList;

public class Rearrange_Characters_to_Make_Target_String {
    public static int rearrangeCharacters(String s, String target) {

        int count = 0;
        ArrayList<Character> inp = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(target.contains(String.valueOf(c))){
                inp.add(c);
            }else {
                inp.clear();
            }
            if(inp.size()==target.length()){
                count++;
                inp.clear();
            }
        }
        return count;
    }
}
