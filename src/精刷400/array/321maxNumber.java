package 精刷400.array;

class Solution321 {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        if (k == 0)
            return new int[0];

        int[] maxSub1 = new int[k];
        int[] maxSub2 = new int[k];
        int[] res = new int[k];
        for (int l = 0; l <= Math.min(k, nums1.length); l++){
            if (l + nums2.length < k)
                continue;
            maxSubArray(nums1, maxSub1, l);
            maxSubArray(nums2, maxSub2, k - l);
            res = merge(maxSub1, maxSub2, l, k - l, res);
        }

        return res;
    }

    // 求 nums 组成最大数的最大子数组，并将值放入 maxSub 中
    // 这个算法其实没那么好懂
    private void maxSubArray(int[] nums, int[] maxSub, int size) {
        if (size != 0) {
            for(int i = 0, j = 0; i < nums.length; i++){
                // 当 nums 还有足够数可以替换，且 nums 当前值大于 maxSub 数组的前一个值时
                // 覆盖 maxSub 数组的前一个值
                while (j > 0 && nums.length - i + j > size && nums[i] > maxSub[j - 1])
                    j--;
                if (j < size)
                    maxSub[j++] = nums[i];
            }
        }
    }

    // 这个函数就非常讨厌了
    private int[] merge(int[] maxSub1, int[] maxSub2, int size1, int size2, int[] res) {
        int[] merge = new int[res.length];
        int i = 0, j = 0, idx = 0;
        boolean equal = true;
        while (i < size1 || j < size2){
            // 若其中一个指针过线，直接复制另一个数组即可
            if (i >= size1)
                merge[idx] = maxSub2[j++];
            else if (j >= size2)
                merge[idx] = maxSub1[i++];
            else{
                // 这个可能就是归并
                int ii = i, jj = j;
                // 大概是为了避免值相同的情况
                while (ii < size1 && jj < size2 && maxSub1[ii] == maxSub2[jj]){
                    ii++; jj++;
                }
                if (ii < size1 && jj < size2){
                    if(maxSub1[ii] > maxSub2[jj])
                        merge[idx] = maxSub1[i++];
                    else
                        merge[idx] = maxSub2[j++];
                }
                else if (ii == size1) {
                    merge[idx] = maxSub2[j++];
                }
                else {
                    merge[idx] = maxSub1[i++];
                }
            }

            if (merge[idx] > res[idx])
                equal = false;
            else if (equal && merge[idx] < res[idx])
                break;
            idx++;
        }

        int k = merge.length;
        if (!equal && i == size1 && j == size2)
            return merge;
        if (equal && merge[k - 1] > res[k - 1])
            return merge;
        return res;
    }
}
