package hot100.easy;

import hot100.ListNode;

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
class Solution234 {
    /**
     * 算法：快慢指针
     * 快慢指针找中点，然后反转后半部分进行比较
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode middle = findMiddle(head);
        middle = reverse(middle);

        return checkIfEqual(head, middle);
    }

    // 快慢指针找中点
    private ListNode findMiddle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        return slowNode;
    }

    private ListNode reverse(ListNode head) {
        ListNode first = head;
        ListNode second = first.next;
        ListNode tmp;

        first.next = null;
        while (second != null) {
            tmp = second.next;
            second.next = first;

            first = second;
            second = tmp;
        }

        return first;
    }

    private boolean checkIfEqual(ListNode leftPart, ListNode rightPart) {
        ListNode leftNode = leftPart;
        ListNode rightNode = rightPart;

        while (leftNode != null && rightNode != null) {
            if (leftNode.val != rightNode.val) {
                return false;
            }

            leftNode = leftNode.next;
            rightNode = rightNode.next;
        }

        return true;
    }
}