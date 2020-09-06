package 杂题;

import java.util.LinkedList;

class Solution {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();

        int car = 0;
        int i = a.length() - 1, j = b.length() - 1;
        for ( ; i >= 0 || j >= 0; i--, j--) {
            int va = i >= 0 ? a.charAt(i) - '0' : 0;
            int vb = j >= 0 ? b.charAt(j) - '0' : 0;
            int ch = va + vb + car;

            car = 0;
            //System.out.println(ch);
            if (ch == 2) {
                ch = 0;
                car = 1;
            } else if (ch == 3) {
                ch = 1;
                car = 1;
            }
            builder.append(ch);
        }

        if (car == 1) {
            builder.append(car);
        }

        return builder.reverse().toString();
    }
}