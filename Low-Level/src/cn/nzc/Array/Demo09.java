/**
 * Copyright (C), 2015-2021
 * FileName: Demo09
 * Author:   niko
 * Date:     2021/1/28 21:34
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          21:34           1.0
 */
package cn.nzc.Array;

import java.util.Arrays;

/**
 * 两数之和
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2jrse/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo09 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    res[0]=i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] res = twoSum(arr, 6);
        System.out.println(Arrays.toString(res));
    }

}