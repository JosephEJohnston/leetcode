/*
import java.util.LinkedList;

class Solution {
    public boolean isValid(String s) {
        boolean flag = true;
        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ||
                s.charAt(i) == '{' ||
                s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;

                if (s.charAt(i) == ')' && stack.peek() != '(')
                    return false;
                else if (s.charAt(i) == '}' && stack.peek() != '{')
                    return false;
                else if (s.charAt(i) == ']' && stack.peek() != '[')
                    return false;
                stack.pop();
            }
        }

        if (!stack.isEmpty())
            return false;
        return flag;
    }
}*/
