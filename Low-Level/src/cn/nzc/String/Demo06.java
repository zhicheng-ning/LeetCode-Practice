/**
 * Copyright (C), 2015-2021
 * FileName: Demo06
 * Author:   niko
 * Date:     2021/1/31 19:21
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          19:21           1.0
 */
package cn.nzc.String;

/**
 * 字符串转换整数 (atoi)
 * 请你来实现一个myAtoi(string s)函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 *
 * 函数myAtoi(string s) 的算法如下：
 *
 * 读入字符串并丢弃无用的前导空格
 * 检查第一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
 * 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 * 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
 * 如果整数数超过 32 位有符号整数范围 [−2^31, 2^31− 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
 * 返回整数作为最终结果。
 * 注意：
 *
 * 本题中的空白字符只包括空格字符 ' ' 。
 * 除前导空格或数字后的其余字符串外，请勿忽略 任何其他字符。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnoilh/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo06 {
    public static int myAtoi(String s) {
        //丢弃前导空格
        s = s.trim();
        long res = 0;
        //注意字符串中全是空格的情况
        if (s.length()==0) return 0;
        char ch = s.charAt(0);
        if (ch!='+'&&ch!='-'&&!Character.isDigit(ch)) return 0;
        //是否是负号
        boolean isNeg = ch == '-';
        //确定下标从0还是从1开始解析数字
        int i=Character.isDigit(ch) ? 0 : 1;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i++) - '0');
            //注意是1L，这样才能使相加的结果自动转为long类型
            if (res > Integer.MAX_VALUE+1L&&isNeg) {
                res = -Integer.MIN_VALUE;
                break;
            }
            if (res > Integer.MAX_VALUE && !isNeg) {
                res = Integer.MAX_VALUE;
                break;
            }
        }
        return isNeg?(int) -res:(int) res;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi(" -42"));
    }


}