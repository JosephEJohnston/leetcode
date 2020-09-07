package 精刷400.array;

class Solution245 {
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int n = words.length;
        int minDis = Integer.MAX_VALUE;
        int p1 = -1, p2 = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(word1)) {
                last = p1;
                p1 = i;
            }
            if (words[i].equals(word2)) {
                p2 = word1.equals(word2) ? last : i;
            }

            if (p1 != -1 && p2 != -1)
                minDis = Math.min(minDis, Math.abs(p1 - p2));
        }

        return minDis;
    }
}