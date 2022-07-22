package com.duan.leetcode;

import com.sun.org.apache.xpath.internal.operations.Bool;

//顺时针打印矩阵
public class offer_29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0)return new int[0];//要用元素个数去判断  最开始用了null判断错误
        int L=0,R=matrix[0].length-1,T=0,B=matrix.length-1,x=0;
        int[] result=new int[(R+1)*(B+1)];


        while(true){
            for(int i=L;i<=R;i++)result[x++]=matrix[T][i];
            if(++T>B)break;
            for(int i=T;i<=B;i++)result[x++]=matrix[i][R];
            if(--R<L)break;
            for(int i=R;i>=L;i--)result[x++]=matrix[B][i];
            if(--B<T)break;
            for(int i=B;i>=T;i--)result[x++]=matrix[i][L];
            if(++L>R)break;
        }
        return  result;
    }
}
