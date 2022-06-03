package 编程随想录.f3字符串;

class Solution28 {
    // 暴力解显然是双重循环
    // KMP：当出现字符串不匹配时，可以记录一部分之前已经匹配的文本内容
    // 利用这些信息避免从头再去做匹配
    // KMP 本质是对暴力法的优化

    /**
     * 当使用暴力匹配法时，若不匹配，会从头开始匹配
     * <p>但如果使用前缀表，就不会从头匹配，而是从上次已经匹配的内容开始匹配</p>
     */
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int[] next = getNext(needle);

        int j = -1;
        for (int i = 0; i < haystack.length(); i++) {
            while (j >= 0 && haystack.charAt(i) != needle.charAt(j + 1)) {
                j = next[j];
            }

            if (haystack.charAt(i) == needle.charAt(j + 1)) {
                j++;
            }

            if (j == (needle.length() - 1)) {
                return (i - needle.length() + 1);
            }
        }

        return -1;
    }

    // 前缀表：下标 i 之前（包括 i）的字符串中，有多大长度的相同前缀后缀
    private int[] getNext(String s) {
        int[] next = new int[s.length()];

        int j = -1;
        next[0] = j;

        for (int i = 1; i < s.length(); i++) {
            // 若前后缀不相同，则向前回退
            while (j >= 0 && s.charAt(i) != s.charAt(j + 1)) {
                j = next[j];
            }

            // 前后缀相同
            if (s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }

            next[i] = j;
        }

        return next;
    }

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();

        System.out.println(solution28.strStr("aabaabaafa", "aabaaf"));
    }
}