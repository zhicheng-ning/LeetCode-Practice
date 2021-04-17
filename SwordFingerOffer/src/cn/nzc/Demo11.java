/**
 * Copyright (C), 2015-2021
 * FileName: Demo11
 * Author:   niko
 * Date:     2021/4/17 21:04
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          21:04           1.0
 */
package cn.nzc;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 */
public class Demo11 {
    public static int minArray(int[] numbers) {
        //方法一
        return Arrays.stream(numbers).min().getAsInt();
        //方法二
        //int len=numbers.length;
        //for(int i=1;i<len;i++){
        //    if(numbers[i]<numbers[i-1])
        //        return numbers[i];
        //}
        //return numbers[0];
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 1, 2};
        System.out.println(minArray(numbers));
    }
}