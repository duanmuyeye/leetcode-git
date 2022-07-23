package com.duan.leetcode;

import com.sun.webkit.dom.HTMLTableRowElementImpl;

public class offer_47 {
    /*
    在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。你可以从棋盘的左上角开始拿格子里的礼物，
    并每次向右或者向下移动一格、直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
     */

    //虽然也是动态规划 但是我写的就看起来很不简洁 O(M*N)
    int[][] gridPublic;
    public int maxValue(int[][] grid) {
        gridPublic = grid;
        int width = grid[0].length, height = grid.length;
        for (int i = 0; i < Math.min(width, height); i++) {
            gridPublic[i][i] = upAndLeftMax(i, i);
            for (int j = i + 1; j < width; j++) {
                gridPublic[i][j] = upAndLeftMax(i, j);
            }
            for (int k = i + 1; k < height; k++) {
                gridPublic[k][i] = upAndLeftMax(k, i);
            }
        }
        return gridPublic[height-1][width-1];
    }
    int upAndLeftMax(int x, int y) {
        int left = gridPublic[x][y], up = gridPublic[x][y];
        if (x - 1 >= 0) left = gridPublic[x][y] + gridPublic[x - 1][y];//这个每次都判断就没有必要 只需要将第一行第一列初始化就可以了
        if (y - 1 >= 0) up = gridPublic[x][y] + gridPublic[x][y - 1];
        return Math.max(left, up);
    }
}
