package 剑指Offer;

import java.util.LinkedList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> array = new LinkedList<>();

        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        //初始化
        int[] ans = new int[nums.length - k + 1];
        for (int j = 0, i = 1 - k; j < nums.length; j++, i++) {
            if (i > 0 && array.getFirst() == nums[i - 1])
                array.removeFirst();
            while (!array.isEmpty() && nums[j] > array.getLast()) {
                array.removeLast();
            }
            array.add(nums[j]);
            if (i >= 0)
                ans[i] = array.getFirst();
        }

        return ans;
    }
}