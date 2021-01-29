/**
 * Copyright (C), 2015-2021
 * FileName: Demo08
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
 * 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2ba4i/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo08 {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) nums[j++] = nums[i];
        }
        int len = nums.length - j;
        for (int i = 0; i < len; i++) {
            nums[j++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}