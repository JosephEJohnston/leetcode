package 编程随想录.f7动态规划.f2背包问题.f2完全背包;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution139 {
    // 完全背包？
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];

        Arrays.fill(dp, false);
        dp[0] = true;

        for (int i = 1; i < dp.length; i++) {
            for (String word : wordDict) {
                if (!dp[i] && i >= word.length()) {
                    dp[i] = dp[i - word.length()] && equalWord(i, s, word);
                }
            }
        }

        return dp[s.length()];
    }

    private boolean equalWord(int index, String s, String word) {
        int wordLength = word.length();
        if (index > s.length()) {
            return false;
        }

        for (int i = 0; i < wordLength; i++) {
            if (s.charAt(i + index - wordLength) != word.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution139 solution139 = new Solution139();

        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");

        solution139.wordBreak("applepenapple", wordDict);
    }
}