package org.example.leetcode.arrays;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int min = prices[0];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){
            int money = prices[i] - min;
            if(money > max) max = money;
            if(prices[i] < min) min = prices[i];
        }

        return max;
//        int min = prices[0];
//        int ind = 0;
//        int max = 0;
//
//        for(int i =1; i<prices.length;i++){
//            if(min>prices[i]){
//                min = prices[i];
//                ind = i;
//            }
//        }
//        if(ind == prices.length-1){
//            return 0;
//        }else {
//            for (int i = ind+1;i<prices.length;i++){
//                    if(max <= prices[i]){
//                        max = prices[i];
//                    }
//            }
//        }
//
//        return max-min;
    }
}
