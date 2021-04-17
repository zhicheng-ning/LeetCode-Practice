/**
 * Copyright (C), 2015-2021
 * FileName: Demo04
 * Author:   niko
 * Date:     2021/4/17 16:17
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          16:17           1.0
 */
package cn.nzc;

/**
 * 剑指 Offer 04. 二维数组中的查找
 * 从右上角开始判断，如果右上角的数字比targrt大，删去所在列；反之，删去所在行,逐步逼近左下角
 * 也可以从左下角开始判断，逐步逼近右上角
 */
//复习
public class Demo04 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0||matrix[0].length==0) return false;
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target > matrix[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int target = 20;
        int[][] matrix = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30},
        };
        boolean numberIn2DArray = findNumberIn2DArray(matrix, target);
        System.out.println(numberIn2DArray);
    }
}