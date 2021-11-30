package hot100.easy;

/**
 * 基本：实现位移计数算法
 */
class Solution461 {
    /*public int hammingDistance(int x, int y) {
        int s = x ^ y;
        int result = 0;
        while (s > 0) {
            result += (s % 2);
            s >>= 1;
        }

        return result;
    }*/

    // 汉明算法: f(x) = x & (x - 1)，为 x 去除最右侧二进制位的结果
    // 这样，循环几次就有几个 1
    public int hammingDistance(int x, int y) {
        int s = x ^ y;
        int result = 0;
        while (s > 0) {
            result++;
            s = s & (s - 1);
        }

        return result;
    }
}