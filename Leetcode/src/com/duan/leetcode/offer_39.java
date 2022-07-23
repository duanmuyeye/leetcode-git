package com.duan.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/*
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */

public class offer_39 {
    //自己写的很垃圾的方法 太慢了 哈希表统计
//    public int majorityElement(int[] nums) {
//        double bounds = (nums.length / 2.0);
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
//            else map.put(num, 1);
//        }
//        for (int key : map.keySet()) {
//            if (map.get(key) > bounds) {
//                return key;
//            }
//        }
//        return -1;
//    }


    //摩尔投票法  可以投出超过一半的数字
    public int majorityElement(int[] nums) {
        int votes = 0, x = 0;
        for (int num : nums) {
            if (votes == 0)
                x = num;
            votes += num == x ? 1 : -1;
        }
        return x;
    }
}


