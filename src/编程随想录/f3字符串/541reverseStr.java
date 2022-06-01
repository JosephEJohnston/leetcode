package 编程随想录.f3字符串;

class Solution541 {
    public String reverseStr(String s, int k) {
        char[] result = s.toCharArray();

        for (int i = 0; i - k <= result.length; i += 2 * k) {

            int start = i;
            int end = Math.min(i + k - 1, result.length - 1);

            while (start < end) {
                char tmp = result[start];
                result[start] = result[end];
                result[end] = tmp;

                start++;
                end--;
            }
        }

        return new String(result);
    }
}