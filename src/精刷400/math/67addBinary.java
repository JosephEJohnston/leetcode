package 精刷400.math;

class Solution67 {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();

        int i = a.length() - 1, j = b.length() - 1;
        int car = 0;
        while (i >= 0 || j >= 0) {
            int x = i >= 0 ? a.charAt(i) - '0' : 0;
            int y = j >= 0 ? b.charAt(j) - '0' : 0;
            int z = x + y + car;

            car = z >= 2 ? z / 2 : 0;
            z %= 2;
            builder.append((char)(z + '0'));
            i--; j--;
        }

        if (car > 0)
            builder.append('1');

        return builder.reverse().toString();
    }
}