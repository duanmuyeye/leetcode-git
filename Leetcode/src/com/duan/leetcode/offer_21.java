package com.duan.leetcode;

import java.time.temporal.Temporal;
import java.util.ArrayList;

public class offer_21 {

    public int[] exchange(int[] nums) {
//        int[] result=new int[nums.length];
//        ArrayList<Integer> tempOdd=new ArrayList<Integer>();
//        ArrayList<Integer> tempEven=new ArrayList<Integer>();
//
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]%2==1)tempOdd.add(nums[i]);
//            else tempEven.add(nums[i]);
//        }
//        for(int i=0;i<tempOdd.size();i++){
//            result[i]=tempOdd.get(i);
//        }
//        for(int i=0;i<tempEven.size();i++){
//            result[i+tempOdd.size()]=tempEven.get(i);
//        }
//        return result;
        int i = 0, j = nums.length - 1, tmp;
        while (i < j) {
            while (i < j && (nums[i] & 1) == 1) i++;
            while (i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
