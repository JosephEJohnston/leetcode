package 编程随想录.f8单调栈;

import java.util.Deque;
import java.util.LinkedList;

class Solution739 {
    // 这道题就离谱
    // 看答案，先理解单调栈模型
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> st = new LinkedList<>();
        int n = temperatures.length;
        int[] result = new int[n];

        st.push(0);

        for (int i = 1; i < n; i++) {
            if (temperatures[i] > temperatures[st.peek()]) {
                while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                    result[st.peek()] = i - st.peek();
                    st.pop();
                }
            }
            st.push(i);
        }

        return result;
    }
}