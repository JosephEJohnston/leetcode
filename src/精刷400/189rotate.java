package 精刷400;

class Solution189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                // swap(nums[next], prev);
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;

                current = next;
                count++;
            } while (start != current);
        }
    }
}

