package org.example.leetcode.string;

public class Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones {
    public static boolean checkOnesSegment(String s) {
//        if (s.equals("1"))
//            return true;
//        int count = 0;
//            for(int i=0; i<s.length()-1;i++){
//                if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
//                    count++;
//                }
//            }
//        return count > 0 ? true : false;
        return !s.contains("01");
    }
}
