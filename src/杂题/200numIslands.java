/*
class Solution {
    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        char[][] grid1 = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
        char[][] grid2 = new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'},
        };
        char[][] grid3 = new char[][]{
                {'1'},
                {'0'},
                {'1'},
        };
        char[][] grid4 = new char[][]{
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'},
        };
        char[][] grid5 = new char[][]{
                {'1', '1', '1', '1', '1', '1', '1'},
                {'0', '0', '0', '0', '0', '0', '1'},
                {'1', '1', '1', '1', '1', '0', '1'},
                {'1', '0', '0', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1', '0', '1'},
                {'1', '0', '1', '1', '1', '0', '1'},
                {'1', '1', '1', '1', '1', '1', '1'},
        };
        char[][] grid6 = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
        System.out.println(numIslands(grid)); //1
        System.out.println(numIslands(grid1));//3
        System.out.println(numIslands(grid2));//1
        System.out.println(numIslands(grid3));//2
        System.out.println(numIslands(grid4));//1
        System.out.println(numIslands(grid5));//1
        System.out.println(numIslands(grid6));//3
    }

    public static void dfs(int x, int y, char[][] grid, int[][] rec) {
        if (!((x >= 0 && x < grid.length) &&
                (y >= 0 && y < grid[0].length))) {
            return;
        } else if (grid[x][y] == '1' && rec[x][y] == 0) {
            rec[x][y] = 1;

            dfs(x - 1, y, grid, rec);
            dfs(x + 1, y, grid, rec);
            dfs(x, y - 1, grid, rec);
            dfs(x, y + 1, grid, rec);
        }
    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int nums = 0;
        int[][] rec = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (rec[i][j] == 0 && grid[i][j] == '1') {
                    nums++;
                    dfs(i, j, grid, rec);
                }
            }
        }
        
        return nums;
    }
}*/
