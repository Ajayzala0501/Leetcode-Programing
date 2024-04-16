package org.example.leetcode.arrays;

import java.util.Arrays;
import java.util.Optional;

public class Maximum_Sum_With_Exactly_K_Elements {
    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i =0;i<k;i++){
            sum+=nums[nums.length-1];
            nums[nums.length-1] = nums[nums.length-1]+1;
        }
        return sum;
    }
}
