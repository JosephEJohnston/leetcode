package 编程随想录.f1链表;

import structure.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// 空间 O(1) 没思路，看答案
class Solution0207 {
    // 求出两个链表的长度，并取差值，然后两个列表都移动到差值对齐的位置
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        int sizeA = 0, sizeB = 0;

        while (pA != null) {
            pA = pA.next;
            sizeA++;
        }

        while (pB != null) {
            pB = pB.next;
            sizeB++;
        }

        int diff = Math.abs(sizeA - sizeB);
        pA = headA;
        pB = headB;

        int count = diff;
        if (sizeA > sizeB) {
            while (count > 0) {
                pA = pA.next;
                count--;
            }
        } else {
            while (count > 0) {
                pB = pB.next;
                count--;
            }
        }

        while (pA != pB && pA != null && pB != null) {
            pA = pA.next;
            pB = pB.next;
        }

        return pA;
    }
}