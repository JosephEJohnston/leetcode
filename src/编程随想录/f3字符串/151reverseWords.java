package 编程随想录.f3字符串;

class Solution151 {
    public String reverseWords(String s) {
        int start = 0, end = s.length() - 1;

        while (s.charAt(start) == ' ') {
            start++;
        }

        while (s.charAt(end) == ' ') {
            end--;
        }

        int countSize = 0;
        for (int i = start; i <= end; i++) {
            countSize++;
            if (s.charAt(i) == ' ') {
                while (i + 1 < s.length() && s.charAt(i + 1) == ' ') {
                    i++;
                }
            }
        }

        char[] result = new char[countSize];
        for (int i = end, j = 0; i >= start; i--, j++) {
            result[j] = s.charAt(i);
            if (s.charAt(i) == ' ') {
                while (i > 0 && s.charAt(i - 1) == ' ') {
                    i--;
                }
            }
        }

        for (int i = 0; i < result.length; ) {
            int left = i;
            int right = left;

            while (right + 1 < result.length &&
                    result[right + 1] != ' ') {
                right++;
            }

            int len = right - left + 1;
            while (left < right) {
                char tmp = result[left];
                result[left] = result[right];
                result[right] = tmp;

                left++;
                right--;
            }

            i += len + 1;
        }

        return new String(result);
    }
}