package 精刷400.array;

class Solution4 {
    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        // 将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k
        return (getKth(nums1, 0, n, nums2, 0, m, left) +
                getKth(nums1, 0, n, nums2, 0, m, right)) * 0.5;
    }

    // k 指代两个数组现在比较的数
    private int getKth(int[] nums1, int start1, int end1,
                       int[] nums2, int start2, int end2, int k) {
        int len1 = end1 - start1;
        int len2 = end2 - start2;
        // 让 len1 的长度小于 len2，这样就能保证如果有数组空了，一定是 len1
        // 保证第一个数组长度必然小于第二个数组
        if (len1 > len2)
            return getKth(nums2, start2, end2, nums1, start1, end1, k);

        // 两个边界条件：
        if (len1 == 0)
            // 当 len1 为 0 时，也就是第一个数组被全部排除
            // 直接返回第二个数组的对应数就可以了
            return nums2[start2 + k - 1];
        if (k == 1)
            // k 为 1 时，返回两个数组起始数中更小的那个
            return Math.min(nums1[start1], nums2[start2]);

        // 这样刚好比较的是第 k/2 个数
        int i = start1 + Math.min(len1, k / 2) - 1;
        int j = start2 + Math.min(len2, k / 2) - 1;

        if (nums1[i] > nums2[j])
            // 排除 nums2 的前半部分
            return getKth(nums1, start1, end1, nums2, j + 1, end2, k - Math.min(len2, k / 2));
        else
            return getKth(nums1, i + 1, end1, nums2, start2, end2, k - Math.min(len1, k / 2));
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m > n)
            return findMedianSortedArrays2(nums2, nums1);

        int iMin = 0, iMax = m;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = (m + n + 1) / 2 - i;
            // i 需要增大
            if (j != 0 && i != m && nums2[j - 1] > nums1[i])
                iMin = i + 1;
            // i 需要减小
            else if (i != 0 && j != n && nums1[i - 1] > nums2[j])
                iMax = i - 1;
            // 达到要求，并且将边界条件列出来单独考虑
            else {
                int maxLeft = 0;
                if (i == 0)
                    maxLeft = nums2[j - 1];
                else if (j == 0)
                    maxLeft = nums1[i - 1];
                else {
                    maxLeft = Math.max(nums1[i - 1] , nums2[j - 1]);
                }
                if ((m + n) % 2 == 1)
                    return maxLeft;

                int minRight = 0;
                if (i == m)
                    minRight = nums2[j];
                else if (j == n)
                    minRight = nums1[i];
                else
                    minRight = Math.min(nums2[j], nums1[i]);

                return (maxLeft + minRight) / 2.0;
            }
        }

        return 0.0;
    }
}