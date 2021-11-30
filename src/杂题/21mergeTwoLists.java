/*

class structure.ListNode {
    int val;
    structure.ListNode next;
    structure.ListNode() {}
    structure.ListNode(int val) { this.val = val; }
    structure.ListNode(int val, structure.ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public structure.ListNode mergeTwoLists(structure.ListNode l1, structure.ListNode l2) {
        structure.ListNode zero = new structure.ListNode(0);
        structure.ListNode list = new structure.ListNode(0);
        structure.ListNode head = list;

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
