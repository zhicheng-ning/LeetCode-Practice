/**
 * Copyright (C), 2015-2021
 * FileName: Demo01
 * Author:   niko
 * Date:     2021/6/1 17:05
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          17:05           1.0
 */
package cn.nzc.Dynamic;

/**
 * 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn854d/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo01 {

    public static int climbStairs(int n) {
        int[] res = new int[n+1];
        res[0]=1;
        res[1] = 1;
        int i=2;
        while (i <= n) {
            res[i] = res[i - 1] + res[i - 2];
            i++;
        }
        return res[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

}