package 编程随想录.f2哈希表;

import java.util.HashSet;
import java.util.Set;

class Solution202 {
    // 这和哈希表有啥关系？看答案
    // 主要是用集合来剪枝
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = generateNumber(n);
        }
        return n == 1;
    }

    private int generateNumber(int n) {
        int sum = 0;
        while (n >= 1) {
            int tmp = n % 10;
            n /= 10;
            sum += tmp * tmp;
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution202 solution202 = new Solution202();
        System.out.println(solution202.isHappy(7));
    }
}