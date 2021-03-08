/**
 * Copyright (C), 2015-2021
 * FileName: Demo04
 * Author:   niko
 * Date:     2021/3/8 11:18
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          11:18           1.0
 */
package cn.nzcer.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 4. 寻找两个正序数组的中位数
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,3], nums2 = [2]
 * 输出：2.00000
 * 解释：合并数组 = [1,2,3] ，中位数 2
 *
 * 提示：
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo04 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] res = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] >= nums2[j]) {
                res[k++] = nums2[j];
                j++;
            } else {
                res[k++] = nums1[i];
                i++;
            }
        }
        if (i == nums1.length) {
            System.arraycopy(nums2, j, res, k, nums2.length - j);
        } else {
            System.arraycopy(nums1, i, res, k, nums1.length - i);
        }
        return res.length%2==1?(double) res[res.length/2]:(double) (res[res.length/2]+res[res.length/2-1])/2.0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}