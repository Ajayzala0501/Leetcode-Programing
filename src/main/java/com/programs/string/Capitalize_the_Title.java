package org.example.leetcode.string;

import java.util.Locale;

public class Capitalize_the_Title {
    public static String capitalizeTitle(String title) {

        StringBuilder sb = new StringBuilder();
        for (String s : title.split(" ")){
            if(s.length()>2){
                sb.append(String.valueOf(s.charAt(0)).toUpperCase());
                sb.append(s.substring(1,s.length()).toLowerCase()+" ");
            }else {
               sb.append(s.toLowerCase()+" ");
            }
        }
        return sb.substring(0,sb.length()-1);
    }
}
