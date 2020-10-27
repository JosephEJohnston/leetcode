package 精刷400.array;

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = nums1.length - 1;
        int i = m - 1, j = n - 1;

        while (k >= 0) {
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j]))
                nums1[k] = nums1[i--];
            else if (i < 0 || (j >= 0 && nums2[j] >= nums1[i]))
                nums1[k] = nums2[j--];
            k--;
        }
    }
}