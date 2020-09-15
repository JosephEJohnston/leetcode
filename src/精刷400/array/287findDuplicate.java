package 精刷400.array;

class Solution287 {
    public int findDuplicate1(int[] nums) {
        int n = nums.length;
        int l = 1, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            int cnt = 0;
            for (int num : nums) {
                if (num <= mid)
                    cnt++;
            }

            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }
        }

        return ans;
    }

    public int findDuplicate2(int[] nums) {
        int n = nums.length, ans = 0;
        int bit_max = 31;
        while (((n - 1) >> bit_max) == 0)
            bit_max -= 1;

        for (int bit = 0; bit <= bit_max; ++bit) {
            int x = 0, y = 0;
            for (int i = 0; i < n; i++) {
                // 将数字和当前为求与，为 1 则此位为 1
                if ((nums[i] & (1 << bit)) != 0)
                    x += 1;
                if (i >= 1 && ((i & (1 << bit)) != 0))
                    y += 1;
            }
            if (x > y)
                ans |= 1 << bit;
        }

        return ans;
    }

    public int findDuplicate3(int[] nums) {
        int slow = 0, fast = 0;
        do {
            // 走一步
            slow = nums[slow];
            // 走两步
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

}