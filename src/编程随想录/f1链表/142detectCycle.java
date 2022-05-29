package 编程随想录.f1链表;

import structure.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if (head != null && head.next == null) {
            return null;
        }

        ListNode slow = head, fast = head;

        // 很显然是快慢指针
        // 但要判断入口，看答案
        // 需要看具体分析，这是将路程分为 x、y、z 分析得来
        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }

            if (slow == fast) {
                // 找到环后，一个从相遇点，一个从起点，每次走一步，此次相遇即为入口
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }
}