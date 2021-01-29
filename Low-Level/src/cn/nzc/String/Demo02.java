/**
 * Copyright (C), 2015-2021
 * FileName: Demo02
 * Author:   niko
 * Date:     2021/1/29 15:13
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          15:13           1.0
 */
package cn.nzc.String;

/**
 * 整数反转
 * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31− 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnx13t/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo02 {
    public static int reverse(int x) {
        //注意使用long来存储翻转后的数，因为翻转后有可能超过int的范围
        long res = 0,k=10;
        boolean isNege = false;
        if (x < 0) {
            isNege = true;
            x = -x;
        }
        do {
            int t = x % 10;
            res = res * k + t;
            x /= 10;
        } while (x != 0);
        if (isNege) res = -res;
        if (res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)return 0;
        return (int) res;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));

    }
}