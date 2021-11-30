import java.util.ArrayList;
/*
import java.util.List;

class structure.ListNode {
    int val;
    structure.ListNode next;
    structure.ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
*/
/*    //算法 1：暴力法
    public boolean hasCycle(structure.ListNode head) {
        if (head == null)
            return false;

        List<structure.ListNode> list = new ArrayList<>();
        while (head != null) {
            for (structure.ListNode listNode : list) {
                if (head == listNode)
                    return true;
            }

            list.add(head);
            head = head.next;
        }

        return false;
    }*//*


    //算法 2：快慢指针
    public boolean hasCycle(structure.ListNode head) {
        if (head == null)
            return false;

        structure.ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null)
                fast = fast.next;
            else
                break;

            if (slow == fast)
                return true;
        }

        return false;
    }
}
*/

