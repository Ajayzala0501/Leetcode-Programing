package org.example.leetcode.string;

public class Rings_and_Rods {
    public static int countPoints(String rings) {

        String color = "RGB";
        int count = 0;
        for (int i = 0;i<10;i++){
            for (int j = 0; j<color.length();j++){
                if(!rings.contains(String.valueOf(color.charAt(j))+i)){
                    break;
                }
                if(j==color.length()-1){
                    count++;
                }
            }
        }
        return count;
    }
}
