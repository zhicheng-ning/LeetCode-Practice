/**
 * Copyright (C), 2015-2021
 * FileName: Demo09
 * Author:   niko
 * Date:     2021/2/1 20:34
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          20:34           1.0
 */
package cn.nzc.String;

/**
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串""。
 *
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 *
 * 提示：
 *
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnmav1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo09 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int size = strs.length,len=Integer.MAX_VALUE;
        //注意空数组的情况
        if (size==0) return "";
        //找到最短的字符串长度
        for (int i = 0; i < size; i++) {
            if (strs[i].length()<len) len = strs[i].length();
        }
        for (int i = 0; i < len; i++) {
            char t = strs[0].charAt(i);
            for (int j = 1; j < size; j++) {
                if (strs[j].charAt(i) != t) {
                    return sb.toString();
                }
            }
            sb.append(t);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

}