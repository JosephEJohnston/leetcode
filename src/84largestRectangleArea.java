/*
import java.util.Stack;

class Solution {
    //基本的二重循环算法
    public int largestRectangleArea(int[] heights) {
        int area = 0, maxArea = 0;
        int minHeight;

        for (int i = 0; i < heights.length; i++) {
            minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                if (heights[j] < minHeight)
                    minHeight = heights[j];

                area = minHeight * (j - i + 1);

                if (area > maxArea)
                    maxArea = area;
            }
        }
        return maxArea;
    }

    //分治
    private static int recursion(int[] heights, int start, int end) {
        int minHeight, minIndex = start;

        if (start == end)
            return 0;
        else if (end - start == 1)
            return heights[start];

        minHeight = heights[start];
        for (int i = start; i < end; i++) {
            if (heights[i] < minHeight) {
                minHeight = heights[i];
                minIndex = i;
            }
        }

        System.out.println(start + "-" + end + "-" + minIndex);
        return Integer.max((end - start) * minHeight ,Integer.max(recursion(heights, start, minIndex),
                recursion(heights, minIndex + 1, end)));
    }

    //分治的包装函数
    public static int largestRectangleArea1(int[] heights) {
        int minHeight, minIndex;

        if (heights != null && heights.length > 0) {
            minHeight = heights[0];
            minIndex = 0;
        } else
            return 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < minHeight) {
                minHeight = heights[i];
                minIndex = i;
            }
        }

       return Integer.max(heights.length * minHeight ,Integer.max(recursion(heights, 0, minIndex),
               recursion(heights, minIndex + 1, heights.length)));
    }

    //单调栈实现（单调递增）
    public static int largestRectangleArea2(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        if (heights == null || heights.length == 0)
            return 0;

        stack.push(-1);
        for (int i = 0; i < heights.length; i++) {
            while (!(stack.peek() == -1) &&
                    heights[i] <= heights[stack.peek()]) {
                maxArea = Math.max(maxArea,
                        heights[stack.pop()] * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        while (!(stack.peek() == -1)) {
            maxArea = Math.max(maxArea,
                    heights[stack.pop()] * (heights.length - stack.peek() - 1));
        }
        
        return maxArea;
    */