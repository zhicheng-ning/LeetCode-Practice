/**
 * Copyright (C), 2015-2021
 * FileName: Demo07
 * Author:   niko
 * Date:     2021/1/28 21:34
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          21:34           1.0
 */
package cn.nzc.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo07 {
    public static int[] plusOne(int[] digits) {
        int k=1,temp=0;
        List<Integer> list = new ArrayList<>();
        for (int i = digits.length - 1; i >= 0; i--) {
            temp = k + digits[i];
            list.add(temp % 10);
            k = temp/ 10;
            //最高位需要进位
            if (temp >= 10 && i == 0) {
                list.add(k);
            }
        }
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        int[] res = plusOne(arr);
        System.out.println(Arrays.toString(res));
    }

}