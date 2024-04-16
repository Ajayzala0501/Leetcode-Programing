package org.example.leetcode.string;

public class Remove_Trailing_Zeros_From_a_String {
    public static String removeTrailingZeros(String num) {
        int count =0;
        for(int i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='0'){
                count++;
            }else {
                break;
            }
        }
        return num.substring(0,num.length()-count);
    }
}
