/**
 * Copyright (C), 2015-2021
 * FileName: Demo08
 * Author:   niko
 * Date:     2021/2/1 20:34
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          20:34           1.0
 */
package cn.nzc.String;

/**
 * 外观数列
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 *
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 *
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 *
 * countAndSay(1) = "1"
 * countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 * 前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 第一项是数字 1
 * 描述前一项，这个数是 1 即 “ 一 个 1 ”，记作 "11"
 * 描述前一项，这个数是 11 即 “ 二 个 1 ” ，记作 "21"
 * 描述前一项，这个数是 21 即 “ 一 个 2 + 一 个 1 ” ，记作 "1211"
 * 描述前一项，这个数是 1211 即 “ 一 个 1 + 一 个 2 + 二 个 1 ” ，记作 "111221"
 * 要 描述 一个数字字符串，首先要将字符串分割为 最小 数量的组，每个组都由连续的最多 相同字符 组成。然后对于每个组，先描述字符的数量，然后描述字符，形成一个描述组。要将描述转换为数字字符串，先将每组中的字符数量用数字替换，再将所有描述组连接起来。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnpvdm/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo08 {
    //模拟题，根据题意序列中的每一项都是对前一项的描述
    //构建nexStr函数来获得下一项

    public static String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <=n; i++) {
            str = nextStr(str);
        }
        return str;
    }

    private static String nextStr(String str) {
        //记录每一组连续字符的个数
        int cnt=0,len = str.length();
        StringBuilder sb = new StringBuilder();
        char ch = str.charAt(0);
        char cur = 0;
        for (int i = 0; i < len; i++) {
            cur = str.charAt(i);
            if (cur == ch) {
                cnt++;
            } else {
                sb.append(cnt);
                sb.append(ch);
                ch = cur;
                cnt = 1;
            }
        }
        //加上最后一组连续字符
        sb.append(cnt);
        sb.append(cur);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

}