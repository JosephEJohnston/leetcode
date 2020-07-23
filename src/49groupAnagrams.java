/*
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new LinkedList<>();

        if (strs == null || strs.length == 0)
            return ans;

        for (String s : strs) {
            int[] chs = new int[26];
            StringBuilder nums = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                chs[(s.charAt(i) - 'a')]++;
            }

            for (int ch : chs) {
                nums.append(ch);
                nums.append('#');
            }

            List<String> list = null;
            String ns = nums.toString();
            if ((list = map.getOrDefault(ns, null)) != null) {
                list.add(s);
            } else {
                list = new LinkedList<>();
                list.add(s);
                map.put(ns, list);
            }
        }
        ans.addAll(map.values());

        return ans;
    }
}*/
