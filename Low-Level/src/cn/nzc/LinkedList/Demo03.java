/**
 * Copyright (C), 2015-2021
 * FileName: Demo03
 * Author:   niko
 * Date:     2021/2/3 22:46
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          22:46           1.0
 */
package cn.nzc.LinkedList;

/**
 * 反转链表
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnnhm6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo03 {
    public ListNode reverseList(ListNode head) {
        //双指针，cur每次将next指向到前一个节点pre，pre再记录当前cur，
        //cur最后再继续向后移动直到链表尾，此时的pre记录的就是反转后链表的头链表
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode t = cur.next;
            cur.next = pre;
            pre = cur;
            cur = t;
        }
        return pre;
    }

    public class ListNode {
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
}