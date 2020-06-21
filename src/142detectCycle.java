/*
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    //算法 1：哈希集
*/
/*    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head))
                return head;

            set.add(head);
            head = head.next;
        }

        return null;
    }*//*


    //算法 2：Floyd 算法（双指针法）
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;

        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null)
                fast = fast.next;
            else
                break;

            if (slow == fast) {
                slow = head;
                while (slow != null && slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                break;
            }
        }

        return fast;
    }
}*/
