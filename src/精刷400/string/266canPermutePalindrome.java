package 精刷400.string;

import java.util.HashMap;
import java.util.Map;

class Solution266 {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int c = 1;
        for (Character character : map.keySet()) {
            if (map.get(character) % 2 != 0)
                c--;

            if (c < 0)
                return false;
        }

        return true;
    }
}