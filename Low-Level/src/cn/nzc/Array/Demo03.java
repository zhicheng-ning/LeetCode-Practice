/**
 * Copyright (C), 2015-2021
 * FileName: Demo03
 * Author:   niko
 * Date:     2021/1/27 13:35
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          13:35           1.0
 */
package cn.nzc.Array;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 旋转数组
 * 给定一个数组，将数组中的元素向右移动k个位置，其中k是非负数。
 *
 *
 * 进阶：
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为O(1) 的原地算法解决这个问题吗？
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo03 {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] temp = Arrays.copyOfRange(nums, len - k, len);
        int[] temp1=Arrays.copyOfRange(nums, 0, len-k);
        System.arraycopy(temp, 0, nums, 0, temp.length);
        System.arraycopy(temp1, 0, nums, temp.length, temp1.length);
        /*for (int i = len - k-1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }*/
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}