package 编程随想录.f5栈与队列;

import java.util.Deque;
import java.util.LinkedList;

class Solution1047 {
    // 和消括号是一个解法
    public String removeDuplicates(String s) {
        Deque<Character> st = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (!st.isEmpty()) {
                char top = st.peek();

                if (cur == top) {
                    st.pop();
                    continue;
                }
            }

            st.push(cur);
        }

        char[] res = new char[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return new String(res);
    }
}