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
    /*
     * 2023/6/4:
     * 个人新写法，哨兵节点操作即可，若进行了删除再移动哨兵节点
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode newHead = new ListNode(-1);
        ListNode record = newHead;
        newHead.next = head;

        while (newHead != null && newHead.next != null) {
            ListNode nextNode = newHead.next;

            if (nextNode.val == val) {
                newHead.next = nextNode.next;
            } else {
                newHead = newHead.next;
            }
        }

        return record.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(6)));


    }
}