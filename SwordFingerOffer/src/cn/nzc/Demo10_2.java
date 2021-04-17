/**
 * Copyright (C), 2015-2021
 * FileName: Demo10_2
 * Author:   niko
 * Date:     2021/4/17 20:59
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          20:59           1.0
 */
package cn.nzc;

/**
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 */
public class Demo10_2 {
    public static int numWays(int n) {
        int[] arr = new int[110];
        arr[0] = 1;
        arr[1] = 1;
        int index = 2;
        while (index <= n) {
            arr[index] = arr[index - 1] % 1000000007 + arr[index - 2] % 1000000007;
            arr[index] %= 1000000007;
            index++;
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(numWays(7));
    }
}