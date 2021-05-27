/**
 * Copyright (C), 2015-2021
 * FileName: Demo03
 * Author:   niko
 * Date:     2021/5/26 16:12
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          16:12           1.0
 */
package cn.nzc.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 *  
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 *
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 *
 * 进阶：
 *
 * 你可以运用递归和迭代两种方法解决这个问题吗？
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn7ihv/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo03 {
    //方法二 :判断两棵树是否对称，则判断两棵树的根结点是否相等，以及每棵树的右子树是否都与左子树镜像对称
    // 递归解决 深度优先遍历
    public static boolean isSymmetric2(TreeNode root) {
        if (root==null) return true;
        return isMirror(root.left, root.right);
    }
    public static boolean isMirror(TreeNode t1,TreeNode t2) {
        //边界条件
        //左右子树都为空
        if (t1==null&&t2==null) return true;
        //一棵子树为空，另一棵子树不为空，必定不对称
        if (t1==null||t2==null) return false;
        //两棵子树的根结点值不同，必定不对称
        if (t1.val!=t2.val) return false;
        //两棵子树的根结点值相同，则递归判断各自的左右子树是否对称
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

    //方法一
    public static boolean isSymmetric(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list,1);
        for (int i = 0; i < list.size()/2; i++) {
            if (list.get(i)!=list.get(list.size()-1-i))
                return false;
        }
        return true;
    }

    public static void dfs(TreeNode node, List<Integer> list,int level) {
        if (node == null) {
            list.add(level);
            return;
        }
        dfs(node.left, list,level+1);
        list.add(node.val);
        dfs(node.right, list,level+1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        System.out.println(isSymmetric2(root));
    }
    //[1,2,2,2,null,2]
}