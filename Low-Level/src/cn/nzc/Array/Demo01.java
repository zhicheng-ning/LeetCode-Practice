/**
 * Copyright (C), 2015-2021
 * FileName: Demo01
 * Author:   niko
 * Date:     2021/1/27 12:27
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          12:27           1.0
 */
package cn.nzc.Array;

/**
 * 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo01 {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for (int j=1;j<nums.length;j++){
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }
}