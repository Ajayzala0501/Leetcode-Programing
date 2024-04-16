package org.example.leetcode.string;

public class Faulty_Keyboard {
    public static String finalString(String s) {
//            int ind = 0;
//            if(!s.contains("i"))
//                return s;
//            StringBuilder sb = new StringBuilder();
//            for (char c:s.toCharArray()){
//                if(c!='i'){
//                    sb.append(c);
//                    ind++;
//                }else {
//                    sb.replace(0,ind,sb.reverse().toString());
//                }
//            }

        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()){
            if(c=='i'){
                sb.reverse();
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
