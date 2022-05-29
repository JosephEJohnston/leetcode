package 编程随想录.f2哈希表;

import java.util.ArrayList;
import java.util.List;

class Solution1002 {
    // 好方法不容易想，看答案
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        if (words.length == 0) {
            return result;
        }

        // 在 hash 中记录每个字符在每个 word 中最少出现的次数
        int[] hash = new int[26];
        for (int i = 0; i < words.length; i++) {
            hash[words[0].charAt(i) - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] hashOtherStr = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                hashOtherStr[words[i].charAt(j) - 'a']++;
            }

            // 每个字符串取最小的
            for (int k = 0; k < 26; k++) {
                hash[k] = Math.min(hash[k], hashOtherStr[k]);
            }
        }

        for (int i = 0; i < 26; i++) {
            // 计算 result
            while (hash[i] != 0) {
                char c = (char) (i + 'a');
                result.add(String.valueOf(c));
                hash[i]--;
            }
        }
        return result;
    }
}