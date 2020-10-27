package 精刷400.string;

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rArr = new int[26];
        int[] mArr = new int[26];

        for (int i = 0; i < ransomNote.length(); i++) {
            rArr[ransomNote.charAt(i) - 'a']++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            mArr[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (rArr[i] > mArr[i])
                return false;
        }

        return true;
    }
}

