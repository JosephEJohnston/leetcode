package 精刷400.array;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class Solution227 {
    public static void main(String[] args) {
        System.out.println(calculate("3 + 5 / (2 + 1)"));
        System.out.println(calculate("3 + 5 / 2"));
        // 这个算法可能是错误的，因为测试用例里没有括号
        // 把和括号相关的部分去掉了
        calculate("3 + 5 / (2 + 1)");
    }
    public static int calculate(String s) {
        return dfs(s, 0);
    }

    private static int dfs(String s, Integer i) {
        Deque<Integer> stack = new LinkedList<>();

        // 记录某个连续的数，比如“42”
        int num = 0;
        char op = '+';
        for (; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // 不是数字，不是空格（元素夫或‘(’或‘)’）
            // 或者到了最后一个字符
            // 那么根据前面记录的 op 操作符，将数字压栈
            // 然后将新的运算符 ch 赋值给 op
            if (!Character.isDigit(ch) && ch != ' ' || i == s.length() - 1) {
                switch (op) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        int pre = stack.pop();
                        stack.push(pre * num);
                        break;
                    case '/':
                        pre = stack.pop();
                        stack.push(pre / num);
                        break;
                }
                num = 0;
                op = ch;
            }

        }


        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }

        return res;
    }
}