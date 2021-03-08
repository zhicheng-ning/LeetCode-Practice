/**
 * Copyright (C), 2015-2021
 * FileName: Demo05
 * Author:   niko
 * Date:     2021/3/8 14:46
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          14:46           1.0
 */
package cn.nzcer.hot;

/**
 * 5. 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 提示：
 * <p>
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母（大写和/或小写）组成
 * <p>
 * https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class Demo05 {
    //检测是否是回文串
    public static boolean check(char[] chars, int i, int j) {
        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //暴力法
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int begin = 0, maxLen = 1;
        //转为chars数组，避免直接用substring产生时间损耗
        char[] chars = s.toCharArray();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && check(chars, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbaa"));
    }

}