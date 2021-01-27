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

public class Demo01 {
    public int removeDuplicates(int[] nums) {
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
        int res = new Demo01().removeDuplicates(nums);
        System.out.println(res);
    }
}