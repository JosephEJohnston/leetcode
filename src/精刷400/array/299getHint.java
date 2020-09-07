package 精刷400.array;

class Solution299 {
    public String getHint(String secret, String guess) {
        int bulls = 0; // 公牛
        int cows = 0; // 母牛
        // 存储出现数字的个数（数字为下标，个数为值）
        int[] nums = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) // 数字和位置相等，公牛数增加
                bulls++;
            else {
                // 更新数组
                // 如果不相等则每次将答案和猜测记录到数组中
                if (nums[s - '0']++ < 0)
                    // 记录增加第 i 位数字的个数
                    // 若比 0 小，则母牛数增加
                    cows++;
                if (nums[g - '0']-- > 0)
                    // 记录减少第 i 位数字的个数
                    // 若比 0 大，则母牛数增加
                    cows++;
                // 数组中每个数字默认是 0，然后遍历时判断个数的变化，记录母牛
            }
        }
        return bulls + "A" + cows + "B";
    }
}