/**
 * Copyright (C), 2015-2021
 * FileName: t2
 * Author:   niko
 * Date:     2021/5/9 19:09
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          19:09           1.0
 */
package cn.nzc;

import java.util.*;

public class t2 {
    static boolean  isSan(int m,int n,int p){
        if(m+n>p && m+p>n && n+p>m){
            return true;
        }
        return false;
    }
    public static int triangleNumber(int[] nums) {
        int n=nums.length;
        Map map=new HashMap();
        //枚举
        int count=0; //记录三角形的个数
        String s;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){  //取三个数 看是否能构成三角形
                    if(isSan(nums[i],nums[j],nums[k])){
                        List list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        System.out.println(list);
                        s = "" + list.get(0) + list.get(1) + list.get(2);
                        if(map.containsKey(s)){
                            continue;
                        }
                        count++;
                        map.put(s,1);
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {2,3,2,4,2};
        int i = triangleNumber(nums);
        System.out.println(i);
    }
}
