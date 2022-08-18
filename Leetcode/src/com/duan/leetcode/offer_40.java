package com.duan.leetcode;

import java.io.ObjectInputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class offer_40 {
    //    public int[] getLeastNumbers(int[] arr, int k) {
//        int[] result = new int[k];
//        for (int i = 0; i < k; i++) {
//            result[i] = arr[i];
//        }
//        for (int i = k; i < arr.length; i++) {
//            int tmp = arr[i];
//            for (int j = 0; j < k; j++) {
//                if (tmp < result[j]) {
//                    int t;
//                    t = result[j];
//                    result[j] = tmp;
//                    tmp=t;
//                }
//            }
//        }
//        return result;
//    }
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr,0,arr.length-1);
        return Arrays.copyOf(arr,k);
    }
    public void quickSort(int[] arr,int l,int r){
        if(l>=r)return;
        int i=l,j=r;
        while(i<j){
            while(i<j&&arr[j]>arr[l])j--;
            while (i<j&&arr[i]<=arr[l])i++;
            swap(arr,i,j);
        }
        swap(arr,l,i);
        quickSort(arr,l,i-1);
        quickSort(arr,i+1,r);
    }
    public void swap(int[] arr,int i,int j){
        int tmp;
        tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

}
