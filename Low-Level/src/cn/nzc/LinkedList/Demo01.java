/**
 * Copyright (C), 2015-2021
 * FileName: Demo01
 * Author:   niko
 * Date:     2021/2/1 21:27
 * Description:
 * History:
 * <author>          <time>          <version>
 * 逝不等琴生          21:27           1.0
 */
package cn.nzc.LinkedList;

/**
 * 删除链表中的节点
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
 *
 * 提示：
 * 链表至少包含两个节点。
 * 链表中所有节点的值都是唯一的。
 * 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 * 不要从你的函数中返回任何结果。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnarn7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Demo01 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
