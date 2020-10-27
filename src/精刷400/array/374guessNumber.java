/*
package 精刷400.array;

*/
/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 *//*


public class Solution374 extends GuessGame {
    public int guessNumber(int n) {
        int left = 1, right = n;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int pick = guess(mid);
            if (pick == -1)
                right = mid - 1;
            else if (pick == 1)
                left = mid + 1;
            else
                return mid;
        }

        return left;
    }
}*/
