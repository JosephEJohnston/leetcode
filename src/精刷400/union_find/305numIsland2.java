package 精刷400.union_find;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution305 {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        List<Integer> ans = new ArrayList<>();
        UnionFind uf = new UnionFind(m * n);

        for (int[] pos : positions) {
            List<Integer> overlap = new ArrayList<>();

            // 此点向上一行是否已填
            if (pos[0] - 1 >= 0 && uf.isValid((pos[0] - 1) * n + pos[1]))
                overlap.add((pos[0] - 1) * n + pos[1]);

            // 此点向下一行是否已填
            if (pos[0] + 1 < m && uf.isValid((pos[0] + 1) * n + pos[1]))
                overlap.add((pos[0] + 1) * n + pos[1]);

            // 此点向左一列是否已填
            if (pos[1] - 1 >= 0 && uf.isValid(pos[0] * n + pos[1] - 1))
                overlap.add(pos[0] * n + pos[1] - 1);

            // 此点向右一列是否已填
            if (pos[1] + 1 < n && uf.isValid(pos[0] * n + pos[1] + 1))
                overlap.add(pos[0] * n + pos[1] + 1);

            // 此点坐标为 index，每个 x 与 y 唯一对应一个坐标
            int index = pos[0] * n + pos[1];
            uf.setParent(index);
            for (Integer i : overlap) {
                // 两个点相邻则合并根节点
                uf.union(i , index);
            }
            ans.add(uf.getCount());
        }

        return ans;
    }

    class UnionFind {
        int count;
        int[] parent;
        int[] rank;

        public UnionFind(int N) {
            count = 0;
            parent = new int[N];
            rank = new int[N];
            Arrays.fill(parent, -1);
        }

        public boolean isValid(int i) {
            return parent[i] >= 0;
        }

        public void setParent(int i) {
            parent[i] = i;
            count++;
        }

        public int find(int i) {
            int root = i;
            while (parent[root] != root)
                root = parent[root];
            return root;
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                if (rank[rootX] > rank[rootY])
                    parent[rootY] = rootX;
                else if (rank[rootX] < rank[rootY])
                    parent[rootX] = rootY;
                else {
                    parent[rootY] = rootX;
                    rank[rootX] += 1;
                }

                count--;
            }
        }

        public int getCount() {
            return count;
        }
    }
}

