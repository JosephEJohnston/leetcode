package 精刷400.string;

class Solution125 {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;

        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < s.length() && !isDigitOrLetter(s.charAt(left)))
                left++;
            while (right >= 0 && !isDigitOrLetter(s.charAt(right)))
                right--;

            if (left < right && s.charAt(left) != s.charAt(right))
                return false;
            left++; right--;
        }

        return true;
    }

    public boolean isDigitOrLetter(char ch) {
        return Character.isDigit(ch) || Character.isLetter(ch);
    }
}