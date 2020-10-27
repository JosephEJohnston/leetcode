package 精刷400.string;

import java.util.HashMap;
import java.util.Map;

class Solution246 {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('1', '1');
        map.put('0', '0');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');

        int left = 0, right = num.length() - 1;
        while (left <= right) {
            if (!(map.getOrDefault(num.charAt(left), null) != null ||
                    map.getOrDefault(num.charAt(right), null) != null))
                return false;

            if (map.get(num.charAt(left)) != num.charAt(right))
                return false;
            left++; right--;
        }

        return true;
    }
}