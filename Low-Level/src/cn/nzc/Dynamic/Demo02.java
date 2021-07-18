/**
 * Copyright (C), 2015-2021
 * FileName: Demo02
 * Author:   niko
 * Date:     2021/6/1 18:53
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          18:53           1.0
 */
package cn.nzc.Dynamic;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 买卖股票的最佳时机
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 * 示例 2：
 *
 * 输入：prices = [7,6,4,3,1]
 * 输出：0
 * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
 *  
 *
 * 提示：
 *
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn8fsh/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo02 {

    /**
     * 动态规划/双指针/单调栈
     * @param prices
     * @return
     */
    //双指针
    public static int maxProfit(int[] prices) {
        int maxVal = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            maxVal = Math.max(maxVal, prices[i] - min);
        }
        return maxVal;
    }
    //单调栈（栈顶总是最小的元素）
    public static int maxProfit1(int[] prices) {
        if (prices==null) return 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(prices[0]);
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (stack.peek() > prices[i]) {
                stack.pop();
                stack.push(prices[i]);
            } else {
                max = Math.max(max, prices[i] - stack.peek());
            }
        }
        return max;
    }
    //动态规划
    //public static int maxProfit2(int[] prices) {
    //
    //}
    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit1(prices));
    }
}