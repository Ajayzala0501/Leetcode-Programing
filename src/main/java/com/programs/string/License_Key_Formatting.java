package org.example.leetcode.string;

import java.util.ArrayList;

public class License_Key_Formatting {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int length = 0;

        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) == '-')
                continue;
            if (length > 0 && length % k == 0)
                sb.append('-');
            sb.append(Character.toUpperCase(s.charAt(i)));
            ++length;
        }

        return sb.reverse().toString();
//        s = s.replaceAll("-","").toUpperCase();
//        StringBuilder sb = new StringBuilder();
//       int len = 0;
//        for(int i= s.length()-1;i>=0;i--){
//            if(len> 0 && len%k==0){
//                sb.append("-");
//            }
//            sb.append(String.valueOf(s.charAt(i)));
//            len++;
//        }
//        return sb.reverse().toString();
    }
}
