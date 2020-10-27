package 精刷400.string;

class Solution14 {
    // 自己实现的，偏麻烦
    public String longestCommonPrefix1(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        StringBuilder ans = new StringBuilder();

        boolean flag = true;
        int j = 0;
        while (flag) {
            if (j < strs[0].length()) {
                char ch = strs[0].charAt(j);
                for (int i = 1; i < strs.length; i++) {
                    if (j >= strs[i].length() || strs[i].charAt(j) != ch) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    ans.append(ch);
                    j++;
                }
            } else {
                break;
            }
        }

        return ans.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }

        return strs[0];
    }
}