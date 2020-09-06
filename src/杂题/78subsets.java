import java.util.ArrayList;
import java.util.List;

/*
class Solution {
    //原代码组
    */
/*private void recursion(int i, int[] nums, List<List<Integer>> ans) {
        int s = ans.size();

        if (i != nums.length) {
            for (int j = 0; j < s; j++) {
                List<Integer> arr = new ArrayList<>();

                arr.add(nums[i]);
                for (int k = 0; k < ans.get(j).size(); k++) {
                    arr.add(ans.get(j).get(k));
                }
                ans.add(arr);
            }
            ans.add(new ArrayList<>(Arrays.asList(nums[i])));

            recursion(i + 1, nums, ans);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        recursion(0, nums, ans);
        ans.add(new ArrayList<>());

        return ans;
    }*//*


    //递归算法（个人实现）：改进最终版
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int number : nums) {
            List<List<Integer>> tmp = new ArrayList<>();
            for (List<Integer> element : ans) {
                //此时不能直接对 ans 进行操作
                tmp.add(new ArrayList<Integer>(element){{add(number);}});
            }
            ans.addAll(tmp);
            ans.add(new ArrayList<Integer>(){{add(number);}});
        }
        ans.add(new ArrayList<>());

        return ans;
    }


    //递归：答案实现
    public List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;
    }

}*/
