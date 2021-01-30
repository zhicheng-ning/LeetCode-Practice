/**
 * Copyright (C), 2015-2021
 * FileName: Demo05
 * Author:   niko
 * Date:     2021/1/30 18:53
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          18:53           1.0
 */
package cn.nzc.String;
import java.util.Objects;

/**
 * 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xne8id/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo05 {
    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        int len = s1.length();
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >='0' && ch <= '9') {
                temp.append(ch);
            }
        }
        return Objects.equals(temp.toString(), temp.reverse().toString());
    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}