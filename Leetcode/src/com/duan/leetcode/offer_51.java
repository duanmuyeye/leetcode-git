package com.duan.leetcode;

public class offer_51 {
    /*
    在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
     */
//    public int reversePairs(int[] nums) {
//        //暴力循环 大规模数组会超出时间限制 卒
//        int res = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) res++;
//            }
//        }
//        return res;
//    }

    //利用归并排序的方式 在并的阶段增加判断逆序对的统计
    int[] nums;
    int count = 0;


    public int reversePairs(int[] nums) {
        this.nums = nums;
        mergeDivide(0, nums.length - 1);
        return count;
    }

    void mergeDivide(int l, int r) {
        if (l >= r) return;
        mergeDivide(l, (r + l) / 2);
        mergeDivide((r + l) / 2 + 1, r);
        merge(l, r);

    }

    void merge(int l, int r) {
        int mid = (l + r) / 2;
        int cursorL = l;
        int cursorR = mid + 1;
        int[] tmp = new int[r - l + 1];
        int t = 0;
        while (cursorL <= mid && cursorR <= r) {
            if (nums[cursorL] <= nums[cursorR]) {
                tmp[t++] = nums[cursorL++];
            } else {
                count += (mid - cursorL) + 1;
                tmp[t++] = nums[cursorR++];
            }
        }
        while (cursorL <= mid) {
            tmp[t++] = nums[cursorL++];
        }
        while (cursorR <= r) {
            tmp[t++] = nums[cursorR++];
        }

        for (int i = 0; i < tmp.length; i++) {
            nums[i + l] = tmp[i];
        }
    }
}
