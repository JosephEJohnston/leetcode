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
class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode first = new ListNode(-1, head);
        ListNode before = first;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val == val) {
                before.next = cur.next;
                cur.next = null;
                cur = before.next;
            } else {
                before = cur;
                cur = cur.next;
            }
        }

        return first.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(6)));


    }
}