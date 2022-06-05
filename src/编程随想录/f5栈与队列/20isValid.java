package 编程随想录.f5栈与队列;

import java.util.Deque;
import java.util.LinkedList;

class Solution20 {
    public boolean isValid(String s) {
        Deque<Character> st = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ')' && ch != ']' && ch != '}') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char topChar = st.pop();
                if ((topChar == '(' && ch != ')') ||
                        (topChar == '[' && ch != ']') ||
                        (topChar == '{' && ch != '}')) {
                    return false;
                }
            }
        }

        return !st.isEmpty();
    }
}