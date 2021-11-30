/*
import org.junit.Test;
import 杂题.Solution;

import java.util.HashMap;
import java.util.Map;

*/
/**
 * 用于测试
 *//*

public class tryTest {
    */
/*public static void main(String[] args) {
        Set<Character> curSet = new HashSet<Character>();
        Set<Character> tSet = new HashSet<Character>();
        Character[] str = new Character[3];
        char[] s = new char[3];
        str[0] = 'a';
        str[1] = 'b';
        str[2] = 'c';
        s[0] = 'a';
        s[1] = 'b';
        s[2] = 'c';

        curSet.add('a');
        curSet.add('b');
        curSet.add('c');
        curSet.add('n');

        tSet.add('c');
        tSet.add('b');
        tSet.add('a');

        System.out.println(curSet.containsAll(tSet));
        System.out.println(curSet.toString());
        System.out.println(str.toString());
        //System.out.println(new String(str));
        System.out.println(new String(s));
    }*//*


    @Test
    public void testMap() {
        Map<Character, Integer> tmp = new HashMap<>();
        tmp.put('a', 3);
        tmp.put('a', 0);
        System.out.println(tmp.get('a'));
    }

    @Test
    public void testArr() {
        int[][] arr = new int[2][3];
        boolean flag = false;

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        System.out.println(flag);
        System.out.println(flag |= true);
    }

    */
/*@Test
    public void test79() {
        String word = "AB";
        char[][] board = {{'A', 'B'}};

        Solution.exist(board, word);
    }*//*


    */
/*@Test
    public void test84() {
        System.out.println(Solution.largestRectangleArea2(new int[]{2, 1, 2}));
    }*//*


    @Test
    public void test85() {
        char[][] matrix = {
                {'1','1','1','1','1','1','1','1'},
                {'1','1','1','1','1','1','1','0'},
                {'1','1','1','1','1','1','1','0'},
                {'1','1','1','1','1','0','0','0'},
                {'0','1','1','1','1','0','0','0'}};

        char[][] matrix1 = {
                {'1','0','1','1','0','1'},
                {'1','1','1','1','1','1'},
                {'0','1','1','0','1','1'},
                {'1','1','1','0','1','0'},
                {'0','1','1','1','1','1'},
                {'1','1','0','1','1','1'}};
        //System.out.println(Solution.maximalRectangle2(matrix1));

    }

    @Test
    public void testNum() {
        System.out.println(1 ^ 1);
    }

*/
/*    @Test
    public void testSortList() {
        structure.ListNode list = new structure.ListNode(4);
        structure.ListNode head = list;
        list.next = new structure.ListNode(2);
        list = list.next;
        list.next = new structure.ListNode(1);
        list = list.next;
        list.next = new structure.ListNode(3);
        list = list.next;

        Solution.sortList(head);
    }*//*


    @Test
    public void test() {
        Solution s = new Solution();

    }

    @Test
    public void testString() {
        StringBuilder s = new StringBuilder();
        s.append('a');
        s.append('a');
        s.append('a');

        System.out.println(s.toString());
    }

    @Test
    public void testSearch() {
        int[] nums = { 4, 5, 6, 0, 1, 2, 3 };

        //Solution.search(nums, 0);
    }
}
*/
