package 精刷400.string;

class Solution38 {
    public String countAndSay(int n) {
        StringBuilder builder = new StringBuilder();

        builder.append('1');
        for (int i = 1; i < n; i++) {
            StringBuilder tmp = new StringBuilder();
            int count = 0, j = 0;
            while (j < builder.length()) {
                char ch = builder.charAt(j);
                while (j < builder.length() && builder.charAt(j) == ch) {
                    count++;
                    j++;
                }
                tmp.append(count);
                tmp.append(ch);
                count = 0;
            }
            builder = tmp;
        }

        return builder.toString();
    }
}