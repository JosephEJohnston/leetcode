package 编程随想录.f5栈与队列;

import java.util.*;

class Solution347 {
    // 显然是不让走排序的
    // 不能使用单调栈，因为栈中元素有可能小于 k
    // 看答案了
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Deque<Integer> st = new LinkedList<>();

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        // 根据 map 的 value 值正序排，为最小堆
        PriorityQueue<Map.Entry<Integer, Integer>> queue =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            queue.add(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll().getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        Solution347 solution347 = new Solution347();

        int[] nums = new int[]{3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};

        solution347.topKFrequent(nums, 10);
    }
}