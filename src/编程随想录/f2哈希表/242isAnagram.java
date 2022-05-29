package 编程随想录.f2哈希表;

class Solution242 {
    // 可以用 1 个数组，一加一减即可
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mem = new int[26];

        for (int i = 0; i < s.length(); i++) {
            mem[s.charAt(i) % 26]++;
        }

        for (int i = 0; i < t.length(); i++) {
            mem[t.charAt(i) % 26]--;
        }

        for (int j : mem) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }
}