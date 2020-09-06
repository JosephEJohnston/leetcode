import java.util.HashMap;
import java.util.Map;

/*
class Solution {
    //暴力法
    */
/*public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return null;

        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            ans[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    ans[1] = j;
                    return ans;
                }
            }
        }

        return ans;
    }*//*


    //一遍哈希
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];

            //直接检测值是否存在
            if (map.containsKey(com)) {
                return new int[]{map.get(com), i};
            }

            map.put(nums[i], i);
        }

        throw new NullPointerException();
    }
}*/
