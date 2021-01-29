/**
 * Copyright (C), 2015-2021
 * FileName: Demo10
 * Author:   niko
 * Date:     2021/1/29 11:06
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          11:06           1.0
 */
package cn.nzc.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 有效的数独
 * 判断一个9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * <p>
 * 数字1-9在每一行只能出现一次。
 * 数字1-9在每一列只能出现一次。
 * 数字1-9在每一个以粗实线分隔的3x3宫内只能出现一次。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2f9gg/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo10 {
    public static boolean isValidSudoku(char[][] board) {
        /*
        //数字1-9在每一行只能出现一次。
        //数字1-9在每一列只能出现一次。
        for (int i = 0; i < 9; i++) {
            List<Character> listRow=new ArrayList<>();
            List<Character> listCol=new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j]>='0'&&board[i][j]<='9')listRow.add(board[i][j]);
                if (board[j][i]>='0'&&board[j][i]<='9') listCol.add(board[j][i]);
            }
            Set<Character> setRow=new HashSet<>(listRow);
            Set<Character> setCol=new HashSet<>(listCol);
            if (setRow.size()!=listRow.size()||setCol.size()!=listCol.size()) return false;
        }
        for (int i = 1; i <=3; i++) {
            for (int j = 1; j <=3; j++) {
                //每个小九宫格
                //数字1-9在每一个以粗实线分隔的3x3宫内只能出现一次。
                List<Character> list=new ArrayList<>();
                for (int r = (i-1)*3; r < i * 3; r++) {
                    for (int c = (j-1)*3; c < j * 3; c++) {
                        if (board[r][c]=='.')continue;
                        list.add(board[r][c]);
                    }
                }
                Set<Character> set=new HashSet<>(list);
                if (list.size()!=set.size()) return false;
            }
        }
        return true;
        */

        //优化解法，哈希表
        int[][] row=new int[9][10];
        int[][] col=new int[9][10];
        int[][] box=new int[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j]=='.')continue;
                int number = board[i][j] - '0';
                if (row[i][number]==1) return false;
                if (col[j][number]==1) return false;
                //注意j/3+(i/3)*3就是数组下标映射到第几个九宫格
                if (box[j/3+(i/3)*3][number]==1) return false;
                row[i][number]=1;
                col[j][number]=1;
                box[j/3+(i/3)*3][number]=1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }
}