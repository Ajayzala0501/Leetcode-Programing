package com.programs.string;

import java.util.ArrayList;
import java.util.HashMap;

public class Uncommon_Words_from_Two_Sentences {
    public static String[] uncommonFromSentences(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(String inp:s1.split(" ")){
            if(map1.containsKey(inp)){
                map1.put(inp,map1.get(inp)+1);
            }else {
                map1.put(inp,1);
            }
        }
        for(String inp:s2.split(" ")){
            if(map2.containsKey(inp)){
                map2.put(inp,map2.get(inp)+1);
            }else {
                map2.put(inp,1);
            }
        }
        for(String inp : s1.split(" ")){
            if(map1.get(inp)==1&&!map2.containsKey(inp)){
                list.add(inp);
            }
        }
        for(String inp : s2.split(" ")){
            if(map2.get(inp)==1&&!map1.containsKey(inp)){
                list.add(inp);
            }
        }
        String[] res =  list.toArray(new String[list.size()]);
        return res;
    }
}
