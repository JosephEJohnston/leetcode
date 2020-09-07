package 精刷400.array;

import java.util.ArrayList;
import java.util.List;

class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        int[] arr = new int[rowIndex + 1];
        arr[0] = 1;
        for (int i = 1; i <= rowIndex; i++) {

            int j;
            int last = arr[0];
            for (j = 1; j < i; j++) {
                int tmp = arr[j];
                arr[j] = arr[j] + last;
                last = tmp;
            }
            arr[j] = 1;
        }

        for (int i : arr) {
            ans.add(i);
        }
        return ans;
    }
}