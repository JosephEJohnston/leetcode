/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 *//*


public class Solution extends Reader4 {
    */
/**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     *//*

    public int read(char[] buf, int n) {
        if (buf == null || n == 0 || buf.length == 0)
            return 0;

        int pos = 0;
        int t;
        char[] buf4 = new char[4];
        do {
            t = read4(buf4);
            for (int i = 0; i < t && i < n; i++) {
                buf[pos++] = buf4[i];
            }
            n -= t;
        } while (n > 0 && t > 0);

        return pos;
    }
}*/
