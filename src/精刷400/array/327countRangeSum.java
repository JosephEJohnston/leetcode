package 精刷400.array;

import java.util.TreeMap;
import java.util.TreeSet;

class Solution32 {
    public int countRangeSum(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0)
            return 0;
        TreeMap<Long, Integer> tree = new TreeMap<>();
        tree.put(0L, 1);

        int count = 0;
        long sum = 0L;
        for (int num : nums) {
            sum += num;
            for (Integer cnt : tree.subMap(sum - upper, true, sum - lower, true).values()) {
                count += cnt;
            }
            tree.put(sum, tree.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}