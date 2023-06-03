package 编程随想录.f8单调栈;

import java.util.*;

class Solution496 {
    // 最优解比较难
    // nums2 做单调栈，nums1 扔 map
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> st = new LinkedList<>();
        int[] result = new int[nums1.length];

        Arrays.fill(result, -1);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }
        st.push(0);

        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i] > nums2[st.peek()]) {
                while (!st.isEmpty() && nums2[i] > nums2[st.peek()]) {
                    Integer index = map.get(nums2[st.peek()]);
                    if (index != null) {
                        result[index] = nums2[i];
                    }
                    st.pop();
                }
            }
            st.push(i);
        }

        return result;
    }
}