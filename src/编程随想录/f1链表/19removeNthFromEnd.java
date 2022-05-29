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
class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = new ListNode(-1, head);

        removeRecursion(first, head, n);

        return first.next;
    }

    private int removeRecursion(ListNode before, ListNode cur, int n) {
        if (cur == null) {
            return n - 1;
        }

        int curIndex = removeRecursion(cur, cur.next, n);

        if (curIndex == 0) {
            before.next = cur.next;
            cur.next = null;
        }

        return curIndex - 1;
    }
}