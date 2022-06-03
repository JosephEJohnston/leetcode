package 编程随想录.f3字符串;

class Solution28 {
    // 暴力解显然是双重循环
    public int strStr(String haystack, String needle) {
        if (needle == null) {
            return -1;
        }

        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            int left1 = i;
            int left2 = 0;

            while (left1 < haystack.length() && left2 < needle.length()) {
                if (haystack.charAt(left1) != needle.charAt(left2)) {
                    break;
                }

                left1++;
                left2++;
            }

            if (left2 == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}