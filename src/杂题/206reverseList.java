/*
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode hnode = new ListNode(-1);
        ListNode tmp = null;

        hnode.next = null;
        while (head != null) {
            tmp = head.next;

            head.next = hnode.next;
            hnode.next = head;

            head = tmp;
        }

        return hnode.next;
    }
}

*/
