/**
 * Copyright (C), 2015-2021
 * FileName: TreeNode
 * Author:   niko
 * Date:     2021/5/26 14:17
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          14:17           1.0
 */
package cn.nzc.Tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}