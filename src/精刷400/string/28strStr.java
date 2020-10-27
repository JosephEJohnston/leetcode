package 精刷400.string;

import java.util.HashSet;
import java.util.Set;

class Solution28 {
    // 暴力算法优化
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0)
            return 0;

        if (haystack.length() < needle.length())
            return -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) &&
                    haystack.length() - i >= needle.length()) {
                boolean flag = true;
                for (int j = 0, k = i; j < needle.length(); j++, k++) {
                    if (haystack.charAt(k) != needle.charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if (flag)
                    return i;
            }
        }
        return -1;
    }

    // kmp 算法
    public static int strStr1(String haystack, String needle) {
        if (needle == null || needle.length() == 0)
            return 0;

        if (haystack.length() < needle.length())
            return -1;

        int n = haystack.length();
        int m = needle.length();
        int[] pi = compute_prefix_function(needle);
        int q = -1;

        for (int i = 0; i < n; i++) {
            while (q > -1 && needle.charAt(q + 1) != haystack.charAt(i))
                q = pi[q];
            if (needle.charAt(q + 1) == haystack.charAt(i))
                q = q + 1;

            if (q == m - 1)
                return i - m + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        kmp_matcher("bacbababacabcbab", "ababaca");
    }

    public static void kmp_matcher(String t, String p) {
        int n = t.length();
        int m = p.length();
        int[] pi = compute_prefix_function(p);
        int q = -1;

        for (int i : pi) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            while (q > -1 && p.charAt(q + 1) != t.charAt(i))
                q = pi[q];
            if (p.charAt(q + 1) == t.charAt(i))
                q = q + 1;

            if (q == m - 1) {
                System.out.println("Pattern occurs with shift: " + (i - m + 1));
                q = pi[q];
            }
        }
    }

    public static int[] compute_prefix_function(String p) {
        int m = p.length();
        int k = -1;
        int[] pi = new int[m];
        pi[0] = -1;

        for (int q = 1; q < m; q++) {
            while (k > -1 && p.charAt(k + 1) != p.charAt(q))
                k = pi[k];
            if (p.charAt(k + 1) == p.charAt(q))
                k = k + 1;
            pi[q] = k;
        }

        return pi;
    }
}

