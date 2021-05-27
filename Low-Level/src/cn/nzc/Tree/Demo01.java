/**
 * Copyright (C), 2015-2021
 * FileName: Demo01
 * Author:   niko
 * Date:     2021/2/5 21:38
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          21:38           1.0
 */
package cn.nzc.Tree;

/**
 * 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明:叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度3 。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnd69e/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo01 {
    //方法二
    public static int maxDepth2(TreeNode root) {
        //边界
        if (root==null) return 0;
        int left = maxDepth2(root.left);
        int right = maxDepth2(root.right);
        return 1+left>=right?left:right;
    }

    //方法一
    public static int maxDepth(TreeNode root) {
        int res=dfs(root,0);
        return  res;
    }

    public static int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        int res=Math.max(dfs(node.left, depth + 1),dfs(node.right, depth + 1));
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9,null,null);
        root.right = new TreeNode(27,null,null);
        System.out.println(maxDepth2(root));
    }
}