import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
*//*    public ListNode sortList(ListNode head) {
        if (head == null)
            return null;

        List<ListNode> list = new ArrayList<>();

        ListNode tmp = head;
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
        ListNode h = tmp;
        for (int i = 1; i < list.size(); i++) {
            tmp.next = list.get(i);
            tmp = list.get(i);
        }
        tmp.next = null;

        return h;
    }*//*

    private static ListNode recursion(ListNode head, int count) {
        if (head == null || count == 0)
            return null;
        else if (count == 1) {
            return head;
        }

        ListNode tmp = head;
        int div = 0;
        while (div < count / 2) {
            tmp = tmp.next;
            div++;
        }

        head = recursion(head, div);
        tmp = recursion(tmp, count - div);
        ListNode front = new ListNode(-1), ptrF = front;
        ListNode left = head, right = tmp;
        int dLeft = div, dRight = count-div;
        while (dLeft > 0 || dRight > 0) {
            if ((dRight > 0 && dLeft == 0) ||
                    (dRight > 0 && dLeft > 0 &&
                            left.val > right.val)) {
                front.next = new ListNode(right.val);
                right = right.next;
                dRight--;
            } else if ((dLeft > 0 && dRight == 0) ||
                    (dRight > 0 && dLeft > 0 &&
                            left.val <= right.val)){
                front.next = new ListNode(left.val);
                left = left.next;
                dLeft--;
            }
            front = front.next;
        }

        return ptrF.next;
    }

    public static ListNode sortList(ListNode head) {
        if (head == null)
            return null;

        ListNode tmp = head;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }

        return recursion(head, count);
    }
}*/
