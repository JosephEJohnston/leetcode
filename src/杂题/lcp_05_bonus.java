/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

class Solution {
    public int[] bonus(int n, int[][] leadership, int[][] operations) {

        return null;
    }

    public Record structure(int n, int[][] leadership) {
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();

        for (int[] ints : leadership) {
            LinkedList<Integer> ns;
            if ((ns = map.getOrDefault(ints[0], null)) != null) {
                ns.add(ints[1]);
            } else {
                ns = new LinkedList<>();
                ns.add(ints[1]);
                map.put(ints[0], ns);
            }
        }


        long[] leetCoins = new long[n + 1];
        Record record = new Record(map, leetCoins);
        return record;
    }

    class Record {
        public HashMap<Integer, LinkedList<Integer>> map;
        public long[] leetCoins;

        public Record(HashMap<Integer, LinkedList<Integer>> map, long[] leetCoins) {
            this.map = map;
            this.leetCoins = leetCoins;
        }
    }
}
*/
