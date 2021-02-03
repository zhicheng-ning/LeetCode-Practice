/**
 * Copyright (C), 2015-2021
 * FileName: Demo02
 * Author:   niko
 * Date:     2021/2/3 20:57
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          20:57           1.0
 */
package cn.nzc.LinkedList;

/**
 * 删除链表的倒数第N个节点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 进阶：你能尝试使用一趟扫描实现吗？
 * <p>
 * 提示：
 * <p>
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn2925/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo02 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //双指针
        ListNode cur = head;
        ListNode pre = cur;
        //原链表只有一个元素
        if (head.next == null && n == 1) return null;

        while (cur != null) {
            ListNode temp = cur;
            for (int i = 0; i < n; i++) {
                if (temp.next == null) {
                    if (cur.next != temp.next) {
                        //删除的不是最后一个元素
                        cur.val = cur.next.val;
                        cur.next = cur.next.next;
                    } else {
                        //删除最后一个元素
                        pre.next = null;
                    }
                    return head;
                } else temp = temp.next;
            }
            pre = cur;
            cur = cur.next;
        }
        return head;
    }

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
}
