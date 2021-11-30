import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*class structure.ListNode {
    int val;
    structure.ListNode next;
    structure.ListNode(int x) { val = x; }
}

class Solution {
*//*    public structure.ListNode sortList(structure.ListNode head) {
        if (head == null)
            return null;

        List<structure.ListNode> list = new ArrayList<>();

        structure.ListNode tmp = head;
        while (tmp != null) {
            list.add(tmp);
            tmp = tmp.next;
        }

        list.sort((o1, o2) -> {
            if (o1.val > o2.val)
                return 1;
            else if (o1.val == o2.val)
                return 0;
            return -1;
        });
        tmp = list.get(0);
        structure.ListNode h = tmp;
        for (int i = 1; i < list.size(); i++) {
            tmp.next = list.get(i);
            tmp = list.get(i);
        }
        tmp.next = null;

        return h;
    }*//*

    private static structure.ListNode recursion(structure.ListNode head, int count) {
        if (head == null || count == 0)
            return null;
        else if (count == 1) {
            return head;
        }

        structure.ListNode tmp = head;
        int div = 0;
        while (div < count / 2) {
            tmp = tmp.next;
            div++;
        }

        head = recursion(head, div);
        tmp = recursion(tmp, count - div);
        structure.ListNode front = new structure.ListNode(-1), ptrF = front;
        structure.ListNode left = head, right = tmp;
        int dLeft = div, dRight = count-div;
        while (dLeft > 0 || dRight > 0) {
            if ((dRight > 0 && dLeft == 0) ||
                    (dRight > 0 && dLeft > 0 &&
                            left.val > right.val)) {
                front.next = new structure.ListNode(right.val);
                right = right.next;
                dRight--;
            } else if ((dLeft > 0 && dRight == 0) ||
                    (dRight > 0 && dLeft > 0 &&
                            left.val <= right.val)){
                front.next = new structure.ListNode(left.val);
                left = left.next;
                dLeft--;
            }
            front = front.next;
        }

        return ptrF.next;
    }

    public static structure.ListNode sortList(structure.ListNode head) {
        if (head == null)
            return null;

        structure.ListNode tmp = head;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }

        return recursion(head, count);
    }
}*/
