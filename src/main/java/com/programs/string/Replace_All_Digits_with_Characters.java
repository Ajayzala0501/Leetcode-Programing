package org.example.leetcode.string;

public class Replace_All_Digits_with_Characters {
    public static String replaceDigits(String s) {

//        StringBuilder sb = new StringBuilder(s);
//        for(int i = 1;i<sb.length();i+=1){
//            if(i%2!=0){
//                System.out.println(sb.charAt(i));
//                sb.setCharAt(i,(char)((int)s.charAt(i-1)+Integer.parseInt(String.valueOf(s.charAt(i)))));
//            }
//        }
//        return sb.toString();
        char[] A = s.toCharArray();

        for (int i = 1; i < A.length; i += 2)
            A[i] += (char) (A[i - 1] - '0');

        return String.valueOf(A);

    }
}
