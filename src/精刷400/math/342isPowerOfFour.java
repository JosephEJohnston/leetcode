package 精刷400.math;

class Solution342 {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (Math.log(num) / Math.log(2)) % 2 == 0;
    }
}
