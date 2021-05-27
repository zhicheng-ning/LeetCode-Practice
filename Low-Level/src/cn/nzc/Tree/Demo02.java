/**
 * Copyright (C), 2015-2021
 * FileName: Demo02
 * Author:   niko
 * Date:     2021/5/26 15:46
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          15:46           1.0
 */
package cn.nzc.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 验证二叉搜索树
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 * 示例1:
 *
 * 输入:
 *     2
 *    / \
 *   1   3
 * 输出: true
 * 示例2:
 *
 * 输入:
 *     5
 *    / \
 *   1   4
 *      / \
 *     3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 *      根节点的值为 5 ，但是其右子节点值为 4 。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn08xg/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo02 {
    public static boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i + 1) <=list.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void dfs(TreeNode node,List<Integer> list) {
        //边界
        if (node == null) {
            return ;
        }
        dfs(node.left, list);
        list.add(node.val);
        dfs(node.right, list);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(isValidBST(root));
    }

}