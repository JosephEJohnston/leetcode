package hot100.easy;

import java.util.ArrayList;
import java.util.List;

class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[(nums[i] % n)] += n;
        }

        List<Integer> result = new ArrayList<>();
        if (nums[0] < n) {
            result.add(n);
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] <= n) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution448 solution448 = new Solution448();

        System.out.println(solution448.findDisappearedNumbers(new int[] {2, 2}));
    }
}