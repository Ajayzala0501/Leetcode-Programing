package org.example.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Check_if_the_Sentence_Is_Pangram {
    public static boolean checkIfPangram(String sentence) {

        Set<Character> seen = new HashSet<>();

        for (final char c : sentence.toCharArray())
            seen.add(c);

        return seen.size() == 26;
//        if(sentence.length()<26)
//            return false;
//
//        ArrayList<Character> inp = new ArrayList<>();
//        for (char c : sentence.toCharArray()){
//            if(!inp.contains(c)){
//                inp.add(c);
//            }
//        }
//         return inp.size()==26 ? true : false;

//        HashMap<Character,Integer> map = new HashMap<>();
//
//        for (char c : sentence.toCharArray()){
//            if(map.containsKey(c)){
//               map.put(c,map.get(c)+1);
//            }else {
//                map.put(c,1);
//            }
//        }
//        return map.size()==26?true:false;
    }
}
