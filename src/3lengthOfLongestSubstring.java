/*
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
    }

    //解法一：双重哈希
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        StringBuilder builder = new StringBuilder(s);
        int ans = 0;

        for (int i = 0; i < builder.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int tmp = 0;
            for (int j = i; j < builder.length(); j++) {
                char c = builder.charAt(j);

                tmp++;
                if (map.containsKey(c)) {
                    break;
                } else {
                    map.put(c, 0);
                }

                ans = Math.max(tmp, ans);
            }
        }

        return ans;
    }

    //解法二：滑动窗口
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int ans = 0;
        int left = 0;
        StringBuilder builder = new StringBuilder(s);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);

            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, i);
            ans = Math.max(i - left + 1, ans);
        }

        return ans;
    }
}*/
