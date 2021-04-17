/**
 * Copyright (C), 2015-2021
 * FileName: Demo03
 * Author:   niko
 * Date:     2021/4/17 16:01
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          16:01           1.0
 */
package cn.nzc;

/**
 * 剑指 Offer 03. 数组中重复的数字
 */
public class Demo03 {
    public static int findRepeatNumber(int[] nums) {
        int res = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (arr[nums[i]] != 0) {
                res = nums[i];
                break;
            }
            arr[nums[i]]++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int repeatNumber = findRepeatNumber(nums);
        System.out.println(repeatNumber);
    }
}