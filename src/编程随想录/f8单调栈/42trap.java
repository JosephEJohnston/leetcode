package 编程随想录.f8单调栈;

import java.util.Deque;
import java.util.LinkedList;

class Solution42 {
    // 怎么算矩形的问题
    public int trap(int[] height) {
        int result = 0;

        Deque<Integer> st = new LinkedList<>();
        st.push(0);

        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[st.peek()]) {
                while (!st.isEmpty() && height[i] > height[st.peek()]) {
                    int bottomHeight = height[st.peek()];
                    st.pop();

                    if (!st.isEmpty()) {
                        int h = Math.min(height[i], height[st.peek()])- bottomHeight;
                        int w = i - st.peek() - 1;

                        result += h * w;
                    }
                }
            }
            st.push(i);
        }

        return result;
    }
}