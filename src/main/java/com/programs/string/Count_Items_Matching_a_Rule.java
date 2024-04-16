package org.example.leetcode.string;

import java.util.Arrays;
import java.util.List;

public class Count_Items_Matching_a_Rule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        List<String> inp = Arrays.asList(new String[]{"type","color", "name"});
        int ind = inp.indexOf(ruleKey);
        for(List<String> inpList : items){
            if(inpList.get(ind).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
