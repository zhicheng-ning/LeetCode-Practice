/**
 * Copyright (C), 2015-2021
 * FileName: Demo11
 * Author:   niko
 * Date:     2021/1/29 11:06
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          11:06           1.0
 */
package cn.nzc.Array;

import java.util.Arrays;

/**
 * 旋转图像
 * 给定一个 n×n 的二维矩阵表示一个图像。
 * <p>
 * 将图像顺时针旋转 90 度。
 * <p>
 * 说明：
 * <p>
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnhhkv/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo11 {
    public static void rotate(int[][] matrix) {
        //先根据左对角线交换，再左右交换
        int len = matrix[0].length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < len; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][len - 1 - i];
                matrix[j][len - 1 - i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(matrix);
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}