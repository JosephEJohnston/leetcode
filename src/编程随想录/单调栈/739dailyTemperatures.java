package 编程随想录.单调栈;

import java.util.Deque;
import java.util.LinkedList;

class Solution739 {
    // 这道题就离谱
    // 看答案，先理解单调栈模型
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> st = new LinkedList<>();
        int[] result = new int[temperatures.length];

        st.push(0);

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] < temperatures[st.peek()]) {
                st.push(i);
            } else if (temperatures[i] == temperatures[st.peek()]) {
                st.push(i);
            } else {
                while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                    result[st.peek()] = i - st.peek();
                    st.pop();
                }
                st.push(i);
            }
        }

        return result;
    }
}