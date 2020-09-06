package 杂题;

class Main {

    public static void main(String[] args) {
        System.out.println(findKthNumber(13, 2));
    }

    // 之所以设为 long，是因为还有坑爹的溢出问题
    public static long getCount(int prefix, int n) {
        long cur = prefix;
        long next = prefix + 1;
        long count = 0;

        while (cur <= n) {
            count += Math.min(next, n + 1) - cur;
            cur *= 10;
            next *= 10;
        }

        return count;
    }


    public static int findKthNumber(int n, int k) {
        int prefix = 1; // 前缀
        long p = 1; // 第 k 个数的指针，也就是数到了字典序第 k 个数

        while (p < k) {
            long count = getCount(prefix, n);
            if (p + count <= k) {
                prefix++;
                p += count;
            } else {
                prefix *= 10;
                p++; // 把指针指向下一子节点，如 100 到 101
            }
        }

        return prefix;
    }
}