package 编程随想录.f5栈与队列;

import java.util.Deque;
import java.util.LinkedList;

class Solution150 {
    // 用栈解，一个符号对应两个整数
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new LinkedList<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int right = st.pop();
                int left = st.pop();

                st.push(operateNumber(left, right, token));
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }

    private boolean isOperator(String str) {
        return "+".equals(str) || "-".equals(str) ||
                "*".equals(str) || "/".equals(str);
    }

    private int operateNumber(int left, int right, String operator) {
        if ("+".equals(operator)) {
            return left + right;
        } else if ("-".equals(operator)) {
            return left - right;
        } else if ("*".equals(operator)) {
            return left * right;
        } else {
            return left / right;
        }
    }

    public static void main(String[] args) {
        Solution150 solution150 = new Solution150();

        System.out.println(solution150.evalRPN(new String[]{"4","13","5","/","+"}));
    }
}