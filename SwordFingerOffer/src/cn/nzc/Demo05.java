/**
 * Copyright (C), 2015-2021
 * FileName: Demo05
 * Author:   niko
 * Date:     2021/4/17 16:59
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          16:59           1.0
 */
package cn.nzc;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo05 {
    public static String replaceSpace(String s) {
        //解法一
        return s.replace(" ", "%20");
        //解法二
        //String[] strs = s.split(" ");
        //String collect = Arrays.stream(strs).collect(Collectors.joining("%20"));
        //return collect;
    }
    public static void main(String[] args) {
        String s = "We are happy.";
        String s1 = replaceSpace(s);
        System.out.println(s1);
    }

}