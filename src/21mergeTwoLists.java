/*

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode zero = new ListNode(0);
        ListNode list = new ListNode(0);
        ListNode head = list;

        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                list.next = l2;
                l2 = l2.next;
            } else {
                list.next = l1;
                l1 = l1.next;
            }
            list = list.next;
        }

        if (l1 == null)
            list.next = l2;
        else
            list.next = l1;

        return head.next;
    }
}*/
