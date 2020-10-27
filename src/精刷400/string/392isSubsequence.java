package 精刷400.string;

class Solution392 {
    public boolean isSubsequence(String s, String t) {
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean flag = false;
            for ( ; pos < t.length(); pos++) {
                if (t.charAt(pos) == ch) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                return false;
            else
                pos++;
        }
        return true;
    }
}