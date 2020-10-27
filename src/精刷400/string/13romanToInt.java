package 精刷400.string;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

class Solution13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        Deque<Integer> stack = new LinkedList<>();
        int sum = 0;
        int i = 0;
        while (i < s.length()) {
            int value = map.get(s.charAt(i));
            stack.push(value);

            i++;
            while (i < s.length() && map.get(s.charAt(i)) > value) {
                stack.push(map.get(s.charAt(i)));
                i++;
            }

            sum += stack.pop();
            while (!stack.isEmpty()) {
                sum -= stack.pop();
            }
        }

        return sum;
    }
}