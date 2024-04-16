package org.example.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kth_Distinct_String_in_an_Array {
    public static String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> map= new HashMap<>();

        for(String s: arr) map.put(s, map.getOrDefault(s,0)+1);

        List<String> ls= new ArrayList<>();
        for(String s: arr) if(map.get(s)==1) ls.add(s);

        if(ls.size()>=k) return ls.get(k-1);

        return "";
    }
}
