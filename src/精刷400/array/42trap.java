package 精刷400.array;

import java.util.Deque;
import java.util.LinkedList;

class Solution42 {
    // 单调栈
    /*public int trap(int[] height) {
        int ans = 0, current = 0;
        Deque<Integer> stack = new LinkedList<>();
        while (current < height.length) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty())
                    break;

                int distance = current - stack.peek() - 1;
                int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            stack.push(current++);
        }

        return ans;
    }*/

    // 双指针
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right) {
            // 移动索引的时候更新 max 变量
            if (height[left] < height[right]) {
                if (height[left] >= left_max)
                    left_max = height[left];
                else
                    // 小于没必要累加
                    // 由于 left 和 right 必然遍历每个索引，故不会漏
                    ans += left_max - height[left];
                left++;
            } else {
                if (height[right] >= right_max)
                    right_max = height[right];
                else
                    ans += right_max - height[right];
                right--;
            }
        }
        return ans;
    }
}

