/**
 * Copyright (C), 2015-2021
 * FileName: Demo06
 * Author:   niko
 * Date:     2021/4/17 17:32
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          17:32           1.0
 */
package cn.nzc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo06 {
    public static int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i).intValue();
        }
        return res;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);

        int[] ints = reversePrint(head);
        System.out.println(Arrays.toString(ints));
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}