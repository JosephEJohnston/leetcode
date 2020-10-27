package 精刷400.string;

class Solution168 {
    // 不算严格的 26 进制，有点奇怪
    public String convertToTitle(int n) {
        StringBuilder b = new StringBuilder();

        while (n > 0) {
            int r = (n - 1) % 26;
            b.append((char) ('A' + r));
            n = (n - r) / 26;
        }

        b.reverse();
        return b.toString();
    }
}