package 精刷400.string;

class Solution171 {
    // 估计不会溢出
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 26 + (s.charAt(i) - 'A' + 1);
        }

        //System.out.println('Z' - 'A');
        return sum;
    }
}