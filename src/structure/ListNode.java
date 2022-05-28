package structure;

/**
 * Definition for singly-linked list.
 * public class structure.ListNode {
 *     int val;
 *     structure.ListNode next;
 *     structure.ListNode() {}
 *     structure.ListNode(int val) { this.val = val; }
 *     structure.ListNode(int val, structure.ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}