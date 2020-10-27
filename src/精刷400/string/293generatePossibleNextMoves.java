package 精刷400.string;

import java.util.LinkedList;
import java.util.List;

class Solution293 {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new LinkedList<>();
        char[] chs = s.toCharArray();

        for (int i = 1; i < chs.length; i++) {
            if (chs[i] == '+' && chs[i - 1] == '+') {
                chs[i] = '-';
                chs[i - 1] = '-';
                list.add(new String(chs));
                chs[i] = '+';
                chs[i - 1] = '+';
            }
        }

        return list;
    }
}