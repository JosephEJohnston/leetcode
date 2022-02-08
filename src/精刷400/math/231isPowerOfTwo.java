package 精刷400.math;

class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        while (n > 1) {
            if (n % 2 != 0)
                return false;
            n /= 2;
        }

        return true;
    }

    // 位运算
    public boolean isPowerOfTwo1(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}