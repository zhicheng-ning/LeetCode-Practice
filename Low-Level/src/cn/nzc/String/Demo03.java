/**
 * Copyright (C), 2015-2021
 * FileName: Demo03
 * Author:   niko
 * Date:     2021/1/29 19:19
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          19:19           1.0
 */
package cn.nzc.String;

/**
 * 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 提示：你可以假定该字符串只包含小写字母。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn5z8r/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo03 {
    public static int firstUniqChar(String s) {
        int[] index = new int[26];
        char[] array = s.toCharArray();
        int res = -1;
        for (int i = 0; i < array.length; i++) {
            index[array[i] - 'a']++;
        }
        for (int i = 0; i < array.length; i++) {
            if (index[array[i] - 'a'] == 1) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(firstUniqChar(str));
    }
}