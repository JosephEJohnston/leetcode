package 精刷400.string;

import java.util.Deque;
import java.util.LinkedList;

class Solution20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;

                char sch = stack.peek();
                if (ch == ')' && sch != '(')
                    return false;
                else if (ch == '}' && sch != '{')
                    return false;
                else if (ch == ']' && sch != '[')
                    return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}