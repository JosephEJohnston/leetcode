package 编程随想录.f3字符串;

class SolutionOffer58 {
    public String reverseLeftWords(String s, int n) {
        char[] result = new char[s.length()];

        int border = n - 1;
        int right = result.length - 1;
        while (border >= 0) {
            result[right] = s.charAt(border);
            right--;
            border--;
        }

        for (int i = n, j = 0; j <= right; i++, j++) {
            result[j] = s.charAt(i);
        }

        return new String(result);
    }
}