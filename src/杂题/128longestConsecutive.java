/*import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    //算法 1：暴力法
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int cur, len, ans = 1;
        boolean flag;
        for (int value : nums) {
            cur = value;
            flag = true;
            len = 1;
            while (flag) {
                flag = false;
                for (int num : nums) {
                    if (num == cur + 1) {
                        cur = cur + 1;

                        flag = true;
                        len++;
                        ans = Math.max(len, ans);

                        break;
                    }
                }
            }
        }
        return ans;
    }

    //算法 2：哈希集——暴力法优化
    public int longestConsecutive1(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        Set<Integer> set = new HashSet<>();
        for (int value : nums) {
            set.add(value);
        }

        int len, ans = 1;
        int curVal;
        for (int value : nums) {
            curVal = value;
            len = 0;
            if (!set.contains(curVal - 1)) {
                while (set.contains(curVal)) {
                    len++;
                    curVal++;
                }

                ans = Math.max(ans, len);
            }
        }
        return ans;
    }
}*/

