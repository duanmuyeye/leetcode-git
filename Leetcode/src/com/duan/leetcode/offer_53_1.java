package com.duan.leetcode;

public class offer_53_1 {
    //offer53-1 有序数组内的target个数
    public int search(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (i < j && nums[i] != target) i++;
            while (i < j && nums[j] != target) j--;
            if (i > j) return 0;
            else if (i == j && nums[i] == target) return 1;
            else if (i == j && nums[i] != target) return 0;
            else return j - i + 1;
        }
        return nums[i] == target ? 1 : 0;
    }
}
