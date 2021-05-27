/**
 * Copyright (C), 2015-2021
 * FileName: Demo13
 * Author:   niko
 * Date:     2021/5/19 21:36
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          21:36           1.0
 */
package cn.nzc;

/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Demo13 {
    public static int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int res = dfs(m, n, 0, 0, k, visited);
        return res;
    }

    public static int dfs(int m, int n, int i, int j, int k, boolean[][] visited) {
        //终止条件
        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j] || getBit(i) + getBit(j) > k) {
            return 0;
        }
        visited[i][j] = true;
        int res;
        res=dfs(m, n, i+1, j, k, visited)
                + dfs(m, n, i-1, j, k, visited)
                + dfs(m, n, i, j+1, k, visited)
                + dfs(m, n, i, j-1, k, visited) + 1;
        return res;
    }

    //获取数字的位和
    public static int getBit(int i) {
        int res = 0;
        do {
            int temp = i % 10;
            res += temp;
            i /= 10;
        } while (i != 0);
        return res;
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int k = 1;
        int count = movingCount(m, n, k);
        //3
        System.out.println(count);
    }
}