package org.example.leetcode.string;

public  class Minimum_Moves_to_Convert_String {
    public static int minimumMoves(String s) {
    int count  = 0;
    StringBuilder sb = new StringBuilder(s);
    for (int i=0;i<sb.length()-2;i++){
        String sub =  sb.substring(i,i+3);
        if(sub.contains("X")){
            sb.replace(i,i+3,sub.replaceAll("X","O"));
            count++;
        }
    }
        return count;
    }
}
