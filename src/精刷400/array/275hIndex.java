package 精刷400.array;

class Solution275 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int i = 0, left = 0, right = n - 1;
        while (left <= right) {
            i = left + (right - left) / 2;
            if (citations[i] == n - i)
                return n - i;
            else if (citations[i] > n - i) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }

        return n - left;
    }
}