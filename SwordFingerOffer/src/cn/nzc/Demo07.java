/**
 * Copyright (C), 2015-2021
 * FileName: Demo07
 * Author:   niko
 * Date:     2021/4/17 17:49
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          17:49           1.0
 */
package cn.nzc;

import javax.swing.tree.TreeNode;
import java.util.Arrays;

/**
 * 剑指 Offer 07. 重建二叉树
 * 通过【前序遍历列表】确定【根节点 (root)】
 * 将【中序遍历列表】的节点分割成【左分支节点】和【右分支节点】
 * 递归寻找【左分支节点】中的【根节点 (left child)】和 【右分支节点】中的【根节点 (right child)】
 * 关键就是在于确定中序遍历中根节点的下标
 */

//复习
public class Demo07 {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0) return null;
        //根节点在中序遍历中的下标
        int rootIndex = 0;
        //根结点的值
        int rootValue=preorder[0];
        TreeNode root = new TreeNode(rootValue);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + rootIndex), Arrays.copyOfRange(inorder, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + rootIndex, preorder.length), Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length));
        return root;
    }
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7}, inorder = {9, 3, 15, 20, 7};
        TreeNode treeNode = buildTree(preorder, inorder);
        System.out.println(treeNode.val);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}