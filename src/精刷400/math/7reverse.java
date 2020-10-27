package 精刷400.math;

class Solution7 {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;

        long tmp = x;
        long sum = 0;
        tmp *= sign;

        while (tmp > 0) {
            sum = sum * 10 + tmp % 10;
            tmp /= 10;
        }

        sum *= sign;
        return (sum <= Integer.MAX_VALUE && sum >= Integer.MIN_VALUE) ? (int)sum : 0;
    }
}