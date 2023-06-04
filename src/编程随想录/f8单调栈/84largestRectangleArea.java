package 编程随想录.f8单调栈;

import java.util.*;

class Solution84 {
    // 看答案了，还是没太理解单调栈
    // 单调递增栈
    // 面积的切割，在递增的高度遇到第一个递减的高度后，之前递增高度的每个面积是可以确定的
    // 在确定一个柱形的面积的时候，除了右边要比当前严格小，其实还蕴含了一个条件，那就是左边也要比当前高度严格小。
    // 上面的解释还不够

    // https://leetcode.cn/problems/largest-rectangle-in-histogram/solution/bao-li-jie-fa-zhan-by-liweiwei1419/
    // [2, 1, 5, 6, 2, 3]
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        } else if (heights.length == 1) {
            return heights[0];
        }

        // 前后哨兵，可以避免多余判断
        int[] newHeights = new int[heights.length + 2];
        // 左边的哨兵让栈非空
        newHeights[0] = 0;
        // 右边的哨兵让元素全部出栈
        newHeights[heights.length + 1] = 0;
        System.arraycopy(heights, 0, newHeights, 1, heights.length);

        int result = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);

        for (int i = 1; i < newHeights.length; i++) {
            while (newHeights[stack.peek()] > newHeights[i]) {
                int curHeight = newHeights[stack.pop()];
                int curWidth = i - stack.peek() - 1;
                result = Math.max(result, curHeight * curWidth);
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution84 solution84 = new Solution84();

        System.out.println(solution84.largestRectangleArea(new int[]{2, 1, 2}));
    }
}