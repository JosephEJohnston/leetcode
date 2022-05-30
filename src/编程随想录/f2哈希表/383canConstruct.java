package 编程随想录.f2哈希表;

import java.util.HashMap;
import java.util.Map;

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 也可以用数组做映射
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            Integer count = map.get(ch);
            if (count == null || count == 0) {
                return false;
            } else {
                map.put(ch, count - 1);
            }
        }

        return true;
    }
}