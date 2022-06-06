package 编程随想录.f5栈与队列;

import java.util.Deque;
import java.util.LinkedList;

class Solution239 {
    // 应该是单调栈
    // 实际上双向队列很好解
    // 看答案了，就是单调队列
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (!deque.isEmpty()) {
                while (!deque.isEmpty() && nums[i] > deque.peek()) {
                    deque.pop();
                }
            }

            deque.push(nums[i]);
        }
        res[0] = deque.getLast();

        for (int i = k, j = 1; i < nums.length; i++, j++) {
            deque.removeLast();

            if (!deque.isEmpty()) {
                while (!deque.isEmpty() && nums[i] > deque.peek()) {
                    deque.pop();
                }
            }

            deque.push(nums[i]);
            res[j] = deque.getLast();
        }


        return res;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] nums = new int[]{7, 2, 4};

        Solution239 solution239 = new Solution239();
        solution239.maxSlidingWindow(nums, 2);

        /*Deque<Integer> deque = new LinkedList<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);

        System.out.println(deque.poll());*/
    }
}