/**
 * Copyright (C), 2015-2021
 * FileName: t1
 * Author:   niko
 * Date:     2021/5/9 19:09
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          19:09           1.0
 */
package cn.nzc;

import sun.nio.cs.ext.ISCII91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 分解质因数
     * @param n int整型 待分解的正整数
     * @return int整型ArrayList<ArrayList<>>
     *     6
     *     [[2,1],[3,1]]
     */
    public static ArrayList<ArrayList<Integer>> factorization (int n) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (isCheck(i)){
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            //记指数
            int[] arr=new int[n+1];

            int c=n;
            int j=i;
            while (c!=1&&j<list.size()){
                int now=list.get(j);
                if (c%now==0){
                    c=c/now;
                    arr[now]++;
                    if (c==1){
                        ArrayList<Integer> item = new ArrayList<>();
                        item.add(now);
                        item.add(arr[now]);
                        res.add(item);
                        return res;
                    }
                }else {
                    ArrayList<Integer> item = new ArrayList<>();
                    item.add(now);
                    item.add(arr[now]);
                    res.add(item);
                    j++;
                }

            }

        }
        return res;
    }

    //判断是否质数
    public static boolean isCheck(int n) {
        int len = (int)Math.sqrt(n * 1.0);
        for (int i = 1; i < len; i++) {
            if (n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> factorization = factorization(24);
        for (int i = 0; i < factorization.size(); i++) {
            ArrayList<Integer> list = factorization.get(i);
            System.out.println(list);
        }

    }
}