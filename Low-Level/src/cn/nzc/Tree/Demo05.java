/**
 * Copyright (C), 2015-2021
 * FileName: Demo05
 * Author:   niko
 * Date:     2021/5/26 19:38
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          19:38           1.0
 */
package cn.nzc.Tree;

import org.w3c.dom.Node;
import sun.reflect.generics.tree.Tree;

/**
 * 将有序数组转换为二叉搜索树
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 *
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：nums = [-10,-3,0,5,9]
 * 输出：[0,-3,9,-10,null,5]
 * 解释：[0,-10,5,null,-3,null,9] 也将被视为正确答案：
 *
 * 示例 2：
 *
 *
 * 输入：nums = [1,3]
 * 输出：[3,1]
 * 解释：[1,3] 和 [3,1] 都是高度平衡二叉搜索树。
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 按 严格递增 顺序排列
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xninbt/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo05 {

    //根据已有的中序遍历来生成二叉搜索树
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums==null) return null;
        return buildBST(nums, 0, nums.length - 1);
    }

    public static TreeNode buildBST(int[] nums, int left, int right) {
        if (left>right) return null;
        int mid = left + (right - left) /2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildBST(nums, left, mid - 1);
        node.right = buildBST(nums, mid + 1, right);
        return node;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        System.out.println(sortedArrayToBST(nums).val);
    }

}