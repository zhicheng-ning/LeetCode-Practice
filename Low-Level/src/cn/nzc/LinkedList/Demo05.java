/**
 * Copyright (C), 2015-2021
 * FileName: Demo05
 * Author:   niko
 * Date:     2021/2/4 22:29
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          22:29           1.0
 */
package cn.nzc.LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * 回文链表
 * 请判断一个链表是否为回文链表。
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnv1oc/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo05 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        //将链表数值存到集合中，再进行回文判断
        if (head == null) return true;
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            //注意Integer属于引用类型的比较，故使用equals来进行值的比较。（==比较的是对象的地址值）
            if (!list.get(i).equals(list.get(list.size() - 1 - i))) return false;
        }
        return true;
    }

}