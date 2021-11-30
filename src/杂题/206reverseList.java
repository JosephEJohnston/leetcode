/*
package 杂题;

public class structure.ListNode {
    int val;
    structure.ListNode next;
    structure.ListNode(int x) {val = x;}
}


class Solution206 {
    public structure.ListNode recursion(structure.ListNode head, structure.ListNode succ) {
        if (succ != null) {
            structure.ListNode tmp = succ.next;
            succ.next = head;
            return recursion(succ, tmp);
        } else {
            return head;
        }
    }

    public structure.ListNode reverseList(structure.ListNode head) {
        structure.ListNode tmp = null;
        if (head != null) {
            tmp = recursion(head, head.next);
            head.next = null;
        }
        return tmp;
    }
}

*/
