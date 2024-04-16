package org.example.leetcode.string;

public class Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks {
    public static int minimumRecolors(String blocks, int k) {

        int min = Integer.MAX_VALUE;

        for(int i=0;i<=blocks.length()-k;i++){
           String subStr =  blocks.substring(i,i+k);
           int count  = 0;
            for(int j = 0;j<subStr.length();j++){
                if(subStr.charAt(j)=='W'){
                    count++;
                }
            }
            if(count<min){
                min =count;
            }
        }
        return min;
    }
}
