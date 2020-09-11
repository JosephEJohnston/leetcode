package 精刷400.array;

import java.util.ArrayList;
import java.util.List;

class Bucket {
    boolean used = false;
    int minval = Integer.MAX_VALUE;
    int maxval = Integer.MIN_VALUE;
}

class Solution164 {
    /*public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2)
            return 0;

        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
        }

        int exp = 1;
        int radix = 10;
        int[] aux = new int[nums.length];

        // 基数排序算法
        while (max / exp > 0) {
            int[] count = new int[radix];

            for (int num : nums) {
                count[(num / exp) % 10]++;
            }

            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }

            // 升序放置
            // 由于基数为 1 时，将数组变为局部有序的
            // 后几轮根据其基数也将是有序的
            for (int i = nums.length - 1; i >= 0; i--) {
                aux[--count[(nums[i] / exp) % 10]] = nums[i];
            }

            System.arraycopy(aux, 0, nums, 0, nums.length);

            exp *= 10;
        }

        // 有序后，找出差距最大者
        int maxGap = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxGap = Math.max(nums[i + 1] - nums[i], maxGap);
        }

        return maxGap;
    }*/

    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2)
            return 0;

        int mini = Integer.MAX_VALUE,
            maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            mini = Math.min(mini, num);
            maxi = Math.max(maxi, num);
        }

        int bucketSize = Math.max(1, (maxi - mini) / (nums.length - 1));
        int bucketNum = (maxi - mini) / bucketSize + 1;
        Bucket[] buckets = new Bucket[bucketNum];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }

        for (int num : nums) {
            int bucketIdx = (num - mini) / bucketSize;
            buckets[bucketIdx].used = true;
            buckets[bucketIdx].minval = Math.min(num, buckets[bucketIdx].minval);
            buckets[bucketIdx].maxval = Math.max(num, buckets[bucketIdx].maxval);
        }

        int prevBucketMax = mini, maxGap = 0;
        for (Bucket bucket : buckets) {
            if (bucket.used) {
                maxGap = Math.max(maxGap, bucket.minval - prevBucketMax);
                prevBucketMax = bucket.maxval;
            }
        }
        
        return maxGap;
    }
}