/*
package 精刷400.array;

public class Solution278 extends VersionControl {
    public int firstBadVersion(int n) {
        // 很典型的二分查找
        int left = 1, right = n;
        while (left < right) {
            int mid = (right - left) / 2 + left;

            if (isBadVersion(mid))
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}*/
