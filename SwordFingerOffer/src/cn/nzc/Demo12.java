/**
 * Copyright (C), 2015-2021
 * FileName: Demo12
 * Author:   niko
 * Date:     2021/4/17 21:14
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          21:14           1.0
 */
package cn.nzc;

import java.util.Arrays;

/**
 * 剑指 Offer 12. 矩阵中的路径
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 *
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 思路：DFS+剪枝
 * 深度优先搜索： 可以理解为暴力法遍历矩阵中所有字符串可能性。DFS 通过递归，先朝一个方向搜到底，再回溯至上个节点，沿另一个方向搜索，以此类推。
 * 剪枝： 在搜索中，遇到 这条路不可能和目标字符串匹配成功 的情况（例如：此矩阵元素和目标字符不同、此元素已被访问），则应立即返回，称之为 可行性剪枝 。
 *
 * 递归参数： 当前元素在矩阵 board 中的行列索引 i 和 j ，当前目标字符在 word 中的索引 k 。
 * 终止条件：
 * 返回 false ： (1) 行或列索引越界 或 (2) 当前矩阵元素与目标字符不同 或 (3) 当前矩阵元素已访问过 （ (3) 可合并至 (2) ） 。
 * 返回 true ： k = len(word) - 1 ，即字符串 word 已全部匹配。
 * 递推工作：
 * 标记当前矩阵元素： 将 board[i][j] 修改为 空字符 '' ，代表此元素已访问过，防止之后搜索时重复访问。
 * 搜索下一单元格： 朝当前元素的 上、下、左、右 四个方向开启下层递归，使用 或 连接 （代表只需找到一条可行路径就直接返回，不再做后续 DFS ），并记录结果至 res 。
 * 还原当前矩阵元素： 将 board[i][j] 元素还原至初始值，即 word[k] 。
 * 返回值： 返回布尔量 res ，代表是否搜索到目标字符串。
 *
 */
public class Demo12 {
    public static boolean exist(char[][] board, String word) {

        //基本数据类型boolean默认值为false
        boolean[][] visited = new boolean[board.length][board[0].length];

        char[] charArray = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                //目标字符串的起点
                if (board[i][j] == charArray[0]) {
                    //dfs：从起点开始进行dfs
                    if (dfs(board, charArray,visited, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, char[] word,boolean[][] visited, int i, int j, int k) {
        //终止条件（失败）：1、行或列索引越界；2、访问已访问过的元素；3、访问的元素未访问但该元素和目标元素不同
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j]||board[i][j]!=word[k]) {
            return false;
        }
        //终止条件（成功）：已经成功搜索到目标字符串
        if (k==word.length-1) {
            return true;
        }
        //递推工作
        visited[i][j] = true;
        boolean res;
        res = dfs(board, word, visited, i + 1, j, k + 1) ||
                dfs(board, word, visited, i - 1, j, k + 1) ||
                dfs(board, word, visited, i, j + 1, k + 1) ||
                dfs(board, word, visited, i, j - 1, k + 1);
        visited[i][j] = false;
        return res;
    }
    public static void main(String[] args) {
        char[][] board = {{'a', 'b'}, {'c', 'd'}};
        boolean isExist = exist(board, "abcd");
        //false
        System.out.println(isExist);
    }
}