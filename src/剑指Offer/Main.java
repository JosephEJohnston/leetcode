package 剑指Offer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        String[] strs = tmp.split(" ");
        int[] nums = new int[strs.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }*/

        //int[] nums = {3, 4, 5, 6, 7, 8, 1, 2};
        //int[] nums = {1, 2};
        //int[] nums = {2, 2, 2, 2, 2, 2};
        //int[] nums = {2, 2, 2, 2, 2, 2};
        //int[] nums = {3, 4, 5, 1, 2, 6, 7, 8};
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(solution(nums));
    }

    /*public static int solution(int[] nums) {
        int max = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : nums) {
            while (list.size() > 0 && list.getLast() >= num) {
                list.removeLast();
            }
            list.addLast(num);
            max = Integer.max(max, list.size());
        }
        return max;
    }*/


    // |0 0 0 0 0 0 0
    // 0 |0 0 0 0 0 0
    // 0 0 |0 0 0 0 0
    // 0 0 0 |1 0 0 0
    // 0 0 0 0 |1 2 2
    // 0 0 0 0 0 |1 0
    // 0 0 0 0 0 0 |1

    // 0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 0
    // 0 0 0 0 0 0 0 0

    // |1 0 0 0 0 0 2 2 10
    // 0 |1 0 0 0 0 2 2 9
    // 0 0 |1 4 4 3 2 2 2
    // 0 0 0 |1 0 3 2 2 5
    // 0 0 0 0 |0 2 1 1 3
    // 0 0 0 0 0 |0 1 1 7
    // 0 0 0 0 0 0 |0 0 101
    // 0 0 0 0 0 0 0 |0 18

    public static int solution(int[] nums) {
        int max = 0;

        int[][] rec = new int[nums.length][nums.length];
        int[] maxs = new int[nums.length];
        maxs[nums.length - 1] = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] < nums[j])
                    rec[i][j] = maxs[j] + 1;
                max = Math.max(max, rec[i][j]);
                maxs[i] = Math.max(rec[i][j], maxs[i]);
            }
        }

        return max + 1;
    }
}
