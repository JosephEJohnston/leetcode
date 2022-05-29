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
// 其实不容易写
class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = new ListNode(-1, head.next);
        ListNode before = first;
        ListNode tmp;
        while (head != null && head.next != null) {
            tmp = head.next;
            head.next = tmp.next;
            tmp.next = head;

            before.next = tmp;
            before = head;
            head = head.next;
        }

        return first.next;
    }
}