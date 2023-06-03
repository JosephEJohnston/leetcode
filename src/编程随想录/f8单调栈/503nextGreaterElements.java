package 编程随想录.f8单调栈;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class Solution503 {
    // 单调栈，走两遍数组即可
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        Arrays.fill(result, -1);

        Deque<Integer> st = new LinkedList<>();
        st.push(0);

        for (int i = 1; i < n * 2; i++) {
            if (nums[i % n] > nums[st.peek() % n]) {
                while (!st.isEmpty() && nums[i % n] > nums[st.peek() % n]) {
                    result[st.peek() % n] = nums[i % n];
                    st.pop();
                }
            }
            st.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution503 solution503 = new Solution503();

        solution503.nextGreaterElements(new int[]{1, 2, 1});

    }
}