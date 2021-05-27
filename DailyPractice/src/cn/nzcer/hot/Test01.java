/**
 * Copyright (C), 2015-2021
 * FileName: Test01
 * Author:   niko
 * Date:     2021/4/27 11:10
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          11:10           1.0
 */
package cn.nzcer.hot;

import java.util.ArrayList;

public class Test01     {
    public static void main(String[] args) {
        int year = 2021;
        int month = 4;
        int dayOfWeek = 4;

        // -------------------- begin -------------------- //
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        int daysOfMonth;
        switch (month) {
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    daysOfMonth = 29;
                } else {
                    daysOfMonth = 28;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysOfMonth = 31;
                break;
            default:
                daysOfMonth = 30;
        }

        int k = 1;
        ArrayList<String> firstWeek = new ArrayList<>(7);
        for (int j = 1; j <= 7; ++j) {
            if (j < dayOfWeek) {
                firstWeek.add("");
            } else {
                firstWeek.add(k++ + "");
            }
        }
        ans.add(firstWeek);
        while (k <= daysOfMonth) {
            ArrayList<String> week = new ArrayList<>(7);
            for (int j = 1; j <= 7; ++j) {
                if (k <= daysOfMonth) {
                    week.add(k++ + "");
                } else {
                    week.add("");
                }
            }
            ans.add(week);
        }

        System.out.println(ans);
        // -------------------- end -------------------- //

    }
}