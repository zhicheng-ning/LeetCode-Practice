/**
 * Copyright (C), 2015-2021
 * FileName: Demo03
 * Author:   niko
 * Date:     2021/3/8 10:56
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          10:56           1.0
 */
package cn.nzcer.hot;

import java.util.HashMap;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 提示：
 *
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo03 {
    public static int lengthOfLongestSubstring(String s) {
        /**
         滑动窗口
         */
        HashMap<Character, Integer> map = new HashMap<>();
        //最大长度
        int res=0;
        //滑动窗口的左边界
        int left=0;
        for(int i=0;i<s.length();i++){
            //碰到重复字符，更新滑动窗口的左边界
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i))+1);
            }
            //记录每个字符目前的最新位置
            map.put(s.charAt(i), i);
            //更新最大长度，即滑动窗口的最大长度
            res = Math.max(res, i - left + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

}