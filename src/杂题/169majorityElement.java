
import java.util.HashMap;

/*
class Solution {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = 0, ans = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > maxValue) {
                ans = key;
                maxValue = map.get(key);
            }
        }

        return ans;
    }
}*/
