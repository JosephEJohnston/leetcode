package 精刷400.string;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null)
            return false;

        if (s.length() != t.length())
            return false;

        TreeMap<Character, Integer> smap = new TreeMap<>(Character::compareTo);
        TreeMap<Character, Integer> tmap = new TreeMap<>(Character::compareTo);
        for (int i = 0; i < s.length(); i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }

        Iterator<Map.Entry<Character, Integer>> siterator = smap.entrySet().iterator();
        Iterator<Map.Entry<Character, Integer>> titerator = tmap.entrySet().iterator();
        while (siterator.hasNext() && titerator.hasNext()) {
            Map.Entry<Character, Integer> se = siterator.next();
            Map.Entry<Character, Integer> te = titerator.next();

            if (!(se.getKey() == te.getKey() && se.getValue().equals(te.getValue())))
                return false;
        }

        return !siterator.hasNext() && !titerator.hasNext();
    }
}