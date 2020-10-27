package 精刷400.string;

import java.util.HashMap;

class Solution387 {
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0)
            return -1;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;
    }
}