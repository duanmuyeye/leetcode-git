package com.duan.leetcode;

public class offer_42 {
    /*
    输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
    要求时间复杂度为O(n)。
     */
    public int maxSubArray(int[] nums) {
        //动态规划  更改了原始num数组
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
//            if (nums[i - 1] > 0) nums[i] += nums[i - 1];
//            if(nums[i]>max)max=nums[i];
            nums[i] += Math.max(nums[i - 1], 0);
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
