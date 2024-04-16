package org.example.leetcode.string;

import java.util.ArrayList;

public class Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
      if(s.length()==1)
          return 1;
      int max = 0;
        StringBuilder sb = new StringBuilder();
      for(int i=0;i<s.length();i++){
        for(int j = i;j<s.length();j++){
          if(sb.indexOf(String.valueOf(s.charAt(j)))<0){
              sb.append(s.charAt(j));
          }else {
              if(max<=sb.length()){
                  max = sb.length();
              }
              sb.delete(0,sb.length());
              j--;
          }
        }
      }
      return max;
    }
}
