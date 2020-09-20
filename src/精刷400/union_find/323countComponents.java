package 精刷400.union_find;

import java.util.Arrays;

class Solution323 {
    public int countComponents(int n, int[][] edges) {
        DisjointSet set = new DisjointSet(n, edges);
        return set.getCount();
    }
}

class DisjointSet {
    private int n;
    private int count;
    private int[] parent;
    private int[] rank;

    DisjointSet(int n, int[][] edges) {
        this.n = n;
        this.count = n;
        parent = new int[n];
        Arrays.fill(parent, -1);
        rank = new int[n];

        for (int[] edge : edges) {
            union(edge[0], edge[1]);
        }
    }

    private int findRoot(int x) {
        int root = x;
        while (parent[root] != -1)
            root = parent[root];

        return root;
    }

    public void union(int x, int y) {
        int xRoot = findRoot(x);
        int yRoot = findRoot(y);

        if (xRoot != yRoot) {
            if (rank[xRoot] == rank[yRoot]) {
                rank[xRoot]++;
                parent[yRoot] = xRoot;
            } else if (rank[xRoot] > rank[yRoot]) {
                parent[yRoot] = xRoot;
            } else {
                parent[xRoot] = yRoot;
            }
            count--;
        }
    }

    public int getCount() {
        return this.count;
    }
}