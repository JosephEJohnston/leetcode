package 精刷400.array;

import java.util.Arrays;

class Solution252 {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return true;

        Arrays.sort(intervals, (arr1, arr2) -> {
            if (arr1[0] > arr2[0])
                return 1;
            else if (arr1[0] < arr2[0])
                return -1;
            return 0;
        });

        for (int i = 0; i < intervals.length - 1; i++)
            if (!(intervals[i][1] <= intervals[i + 1][0]))
                return false;
        return true;
    }
}