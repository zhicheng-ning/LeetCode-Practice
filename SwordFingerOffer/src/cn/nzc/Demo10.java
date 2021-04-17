/**
 * Copyright (C), 2015-2021
 * FileName: Demo10
 * Author:   niko
 * Date:     2021/4/17 20:45
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          20:45           1.0
 */
package cn.nzc;

/**
 * 剑指 Offer 10- I. 斐波那契数列
 */
public class Demo10 {
    public static int fib(int n) {
        int[] arr = new int[110];
        arr[0] = 0;
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
        System.out.println(fib(7));
    }
}