package 精刷400.string;

import java.util.HashMap;
import java.util.Map;

class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || pattern.length() == 0)
            return false;

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> rev = new HashMap<>();

        int j = 0, i = 0;
        for ( ; i < pattern.length(); i++) {
            Character ch = pattern.charAt(i);
            if (j < s.length()) {
                while (j < s.length() && s.charAt(j) == ' ')
                    j++;

                int k = j;
                while (j < s.length() && s.charAt(j) != ' ')
                    j++;

                String check = s.substring(k, j);
                String str = map.getOrDefault(ch, null);
                Character c = rev.getOrDefault(check, null);
                if (str == null && c == null) {
                    map.put(ch, check);
                    rev.put(check, ch);
                } else if (!(c == ch && check.equals(str))) {
                    return false;
                }
            } else
                break;
        }

        return j == s.length() && i == pattern.length();
    }
}