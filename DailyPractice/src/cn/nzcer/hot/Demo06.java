/**
 * Copyright (C), 2015-2021
 * FileName: Demo06
 * Author:   niko
 * Date:     2021/3/10 10:01
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          10:01           1.0
 */
package cn.nzcer.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 0 <= nums.length <= 3000
 * -10^5 <= nums[i] <= 10^5
 */
public class Demo06 {
    /**
     * 首先对nums进行遍历，确定一个nums[i]，那么问题就转化为
     * 从nums[i+1]到nums[nums.length-1]之间找寻两个数b和c，使得
     * nums[i]+b+c=0；同时因为是不重复的三元组，所以需要注意的是相邻
     * 两个数组元素若是相同，则需要跳过。
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int cur = nums[i];
            //避免出现重复的三元组
            if (i>0&&cur==nums[i-1]) continue;
            int l = i + 1, r = len - 1;
            while (l < r) {
                int temp = cur + nums[l] + nums[r];
                if (temp > 0) {
                    r--;
                } else if (temp < 0) {
                    l++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(cur);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    //避免出现重复的三元组
                    while (l<r&&nums[l+1]==nums[l]) l++;
                    while (l<r&&nums[r-1]==nums[r]) r--;
                    l++;
                    r--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
}