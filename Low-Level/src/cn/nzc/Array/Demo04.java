/**
 * Copyright (C), 2015-2021
 * FileName: Demo04
 * Author:   niko
 * Date:     2021/1/27 18:34
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          18:34           1.0
 */
package cn.nzc.Array;

import java.util.Arrays;
import java.util.HashSet;

/**
 *存在重复元素
 *  给定一个整数数组，判断是否存在重复元素。
 *
 *  如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 *  作者：力扣 (LeetCode)
 *  链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x248f5/
 *  来源：力扣（LeetCode）
 *  著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo04 {
    public static boolean containsDuplicate(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        return new HashSet<>(Arrays.asList(arr)).size()!=nums.length;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(containsDuplicate(arr));
    }

}