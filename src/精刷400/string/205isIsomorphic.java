package 精刷400.string;

import java.util.HashMap;
import java.util.Map;

class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        return isIsomorphicCheck(s, t) && isIsomorphicCheck(t, s);
    }

    public boolean isIsomorphicCheck(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character ch = map.getOrDefault(s.charAt(i), null);
            if (ch == null) {
                map.put(s.charAt(i), t.charAt(i));
            } else if (ch != t.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}