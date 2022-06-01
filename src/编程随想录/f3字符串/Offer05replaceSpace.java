package 编程随想录.f3字符串;

class SolutionOffer05 {
    public String replaceSpace(String s) {
        int countBlank = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                countBlank++;
            }
        }

        int len = s.length() + countBlank * 2;
        char[] result = new char[len];
        for (int i = 0, j = 0; i < s.length(); i++, j++) {
            if (s.charAt(i) == ' ') {
                result[j] = '%';
                result[j + 1] = '2';
                result[j + 2] = '0';
                j += 2;
            } else {
                result[j] = s.charAt(i);
            }
        }

        return new String(result);
    }
}