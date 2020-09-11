package 杂题;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}


class Solution206 {
    public ListNode recursion(ListNode head, ListNode succ) {
        if (succ != null) {
            ListNode tmp = succ.next;
            succ.next = head;
            return recursion(succ, tmp);
        } else {
            return head;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode tmp = null;
        if (head != null) {
            tmp = recursion(head, head.next);
            head.next = null;
        }
        return tmp;
    }
}

