package 编程随想录.f2哈希表;

class Solution459 {
    // kmp，然后算是不是大于长度的一半
    // 看下答案，判断条件有点奇怪（不太好写）
    public boolean repeatedSubstringPattern(String s) {
        int[] prefixLength = new int[s.length()];
        int length = prefixLength.length;

        int j = 0;
        prefixLength[j] = 0;
        for (int i = 1; i < length; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = prefixLength[j - 1];
            }

            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }

            prefixLength[i] = j;
        }

        int lastValue = prefixLength[length - 1];
        return (length % (length - lastValue) == 0) &&
                lastValue != 0;
    }

    public static void main(String[] args) {
        Solution459 solution459 = new Solution459();

        System.out.println(solution459.repeatedSubstringPattern("abac"));
    }
}