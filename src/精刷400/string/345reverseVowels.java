package 精刷400.string;

import java.util.HashSet;
import java.util.Set;

class Solution345 {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0)
            return "";

        Set<Character> set = new HashSet<>();
        set.add('a'); set.add('A');
        set.add('e'); set.add('E');
        set.add('i'); set.add('I');
        set.add('o'); set.add('O');
        set.add('u'); set.add('U');

        char[] ans = new char[s.length()];
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            while (i < s.length() && !set.contains(s.charAt(i))) {
                ans[i] = s.charAt(i);
                i++;
            }
            while (j >= 0 && !set.contains(s.charAt(j))) {
                ans[j] = s.charAt(j);
                j--;
            }

            if (i <= j) {
                ans[i] = s.charAt(j);
                ans[j] = s.charAt(i);
                i++; j--;
            }
        }

        return new String(ans);
    }
}