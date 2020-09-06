/*
import java.util.*;

class Solution {

    */
/*//*
/算法 1：暴力回溯（超时）
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean ans = false;

        if (s.length() == 0)
            return true;

        for (String word : wordDict) {
            if (s.charAt(0) == word.charAt(0)) {
                if (word.length() <= s.length() &&
                        s.substring(0, word.length()).equals(word)) {

                    //对每个可能的单词进行回溯，确保不漏
                    ans |= wordBreak(s.substring(word.length()), wordDict);

                    if (ans)
                        break;
                }
            }
        }

        return ans;
    }*//*


    //算法 2：记忆化回溯，本质上是对一些冗长但是答案错误的输入进行优化
    //就是超时的那个输入
    */
/*public boolean recursion(int start, Boolean[] mem, String s, HashSet<String> wordDict) {
        if (s.length() == 0)
            return true;

        if (mem[start] != null)
            return mem[start];

        for (int i = 1; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(0, i)) &&
                    recursion(i, mem, s.substring(i), wordDict)) {

                return mem[start] = true;
            }
        }

        return mem[start] = false;
    }


    public boolean wordBreak(String s, List<String> wordDict) {
        return recursion(0, new Boolean[s.length()], s, new HashSet<>(wordDict));
    }*//*


    //算法 3：广度优先搜索
    public boolean wordBreak(String s, List<String> wordDict) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] visit = new boolean[s.length()];

        queue.add(0);
        while (!queue.isEmpty()) {
            int start = queue.remove();
            if (!visit[start]) {
                for (int end = start + 1; end <= s.length(); end++) {
                    if (wordDict.contains(s.substring(start, end))) {
                        if (end == s.length())
                            return true;

                        queue.add(end);
                    }
                }
                visit[start] = true;
            }
        }

        return false;
    }
}*/
