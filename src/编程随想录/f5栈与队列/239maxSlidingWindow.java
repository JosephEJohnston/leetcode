package 编程随想录.f5栈与队列;

import java.util.Deque;
import java.util.LinkedList;

class Solution239 {
    // 应该是单调栈
    // 实际上双向队列很好解
    // 看答案了，就是单调队列
    // 还有一个索引的问题
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();

        int n = nums.length;
        int[] res = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            // 队列头节点需要在 [i-k+1, i] 范围内，否则要弹出
            while (!deque.isEmpty() && deque.getLast() < i - k + 1) {
                deque.removeLast();
            }

            // 既然是单调，就要保证每次放进去的数据要比末尾的都大，否则也弹出
            while (!deque.isEmpty() && nums[deque.peek()] < nums[i]) {
                deque.pop();
            }

            deque.push(i);

            if (i >= k - 1) {
                res[idx++] = nums[deque.getLast()];
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};

        Solution239 solution239 = new Solution239();
        solution239.maxSlidingWindow(nums, 3);

        /*Deque<Integer> deque = new LinkedList<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);

        System.out.println(deque.poll());*/
    }
}