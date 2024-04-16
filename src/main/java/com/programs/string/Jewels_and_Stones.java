package org.example.leetcode.string;

public class Jewels_and_Stones {
    public static int numJewelsInStones(String jewels, String stones) {

        int num = 0;
        for(char c:stones.toCharArray()){
            if(jewels.indexOf(c)>=0){
                num++;
            }
        }
        return num;
    }
}
