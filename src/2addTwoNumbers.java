/*

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0); //结果链表
        ListNode ptrList = list;            //指向结果链表的指针
        ListNode zero = new ListNode(0); //用于指代“0”
        int carry = 0;  //存储进位值

        while (l1 != zero || l2 != zero) {
            int curnum = l1.val + l2.val + carry;
            carry = curnum / 10;
            curnum = curnum % 10;

            list.next = new ListNode(curnum);
            list = list.next;

            l1 = (l1.next == null) ? zero : l1.next;
            l2 = (l2.next == null) ? zero : l2.next;
        }

        if (carry != 0) {
            list.next = new ListNode(carry);
        }

        return ptrList.next;
    }
}*/
