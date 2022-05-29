package 编程随想录.f1链表;

import structure.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// 其实不简单，很容易翻车
class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode first = new ListNode(-1, head);
        ListNode tmp, before = null;

        while (head != null) {
            tmp = head.next;
            head.next = before;

            before = head;
            head = tmp;
        }
        first.next = before;

        return first.next;
    }
}