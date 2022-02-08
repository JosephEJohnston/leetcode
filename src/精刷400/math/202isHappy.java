package 精刷400.math;

class Solution202 {
    public boolean isHappy(int n) {
        int low = n, fast = n;

        do {
            low = getNext(low);
            fast = getNext(getNext(fast));

            if (low == 1 || fast == 1)
                return true;
        } while (low != fast);

        return false;
    }

    public int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r * r;
            n /= 10;
        }
        return sum;
    }
}