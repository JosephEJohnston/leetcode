/*

class structure.ListNode {
    int val;
    structure.ListNode next;
    structure.ListNode(int x) { val = x; }
}

class Solution {
    public structure.ListNode addTwoNumbers(structure.ListNode l1, structure.ListNode l2) {
        structure.ListNode list = new structure.ListNode(0); //结果链表
        structure.ListNode ptrList = list;            //指向结果链表的指针
        structure.ListNode zero = new structure.ListNode(0); //用于指代“0”
        int carry = 0;  //存储进位值

        while (l1 != zero || l2 != zero) {
            int curnum = l1.val + l2.val + carry;
            carry = curnum / 10;
            curnum = curnum % 10;

            list.next = new structure.ListNode(curnum);
            list = list.next;

            l1 = (l1.next == null) ? zero : l1.next;
            l2 = (l2.next == null) ? zero : l2.next;
        }

        if (carry != 0) {
            list.next = new structure.ListNode(carry);
        }

        return ptrList.next;
    }
}*/
