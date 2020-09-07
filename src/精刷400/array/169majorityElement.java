package 精刷400.array;

import java.util.HashMap;
import java.util.Map;

class Solution169 {
    // 哈希表
    /*public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // 返回 Map 所对应的条目，就是每个键值对
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue())
                majorityEntry = entry;
        }

        // 总是存在多数元素，不为空
        return majorityEntry.getKey();
    }*/

    // 摩尔投票法
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // 必然有多数元素，不为空
        return candidate;
    }
}