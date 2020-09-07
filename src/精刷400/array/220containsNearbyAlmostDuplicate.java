package 精刷400.array;

import java.util.HashMap;
import java.util.Map;

class Solution220 {

    // 在 Java 中，-3 / 5 = 0，但我们需要 -3 / 5 = -1
    // 可确保一个桶中最多分布 w 个数，且最大减最小为 t
    // 测例：-6，-5，-4，-3，-2，-1，0，1，2，3，4，5，6
    private long getBucket(long num, long w) {
        return num < 0 ? (num + 1) / w - 1 : num / w;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0)
            return false;

        Map<Long, Long> d = new HashMap<>();
        // t 可能为 0
        long w = (long)t + 1;
        for (int i = 0; i < nums.length; i++) {
            long bucket = getBucket(nums[i], w);

            // 查找 [x - t ,x + t]
            if (d.containsKey(bucket))
                return true;
            if (d.containsKey(bucket - 1) && Math.abs(nums[i] - d.get(bucket - 1)) <= t)
                return true;
            if (d.containsKey(bucket + 1) && Math.abs(nums[i] - d.get(bucket + 1)) <= t)
                return true;
            d.put(bucket, (long)nums[i]);

            // 去除桶中最早放入的数
            if (i >= k)
                d.remove(getBucket(nums[i - k], w));
        }

        return false;
    }
}