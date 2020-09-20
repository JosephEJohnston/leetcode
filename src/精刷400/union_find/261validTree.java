/*
package 精刷400.union_find;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Solution261 {
    // Union find
    public boolean validTree1(int n, int[][] edges) {
        DisjointSet disjointSet = new DisjointSet(n);
        for (int[] edge : edges) {
            if (!disjointSet.union(edge[0], edge[1]))
                return false;
        }
        return disjointSet.getCount() == 1;
    }

    // BFS
    public boolean validTree2(int n, int[][] edges) {
        // 构建邻接矩阵
        int[][] graph = new int[n][n];
        // 有边的元素设置为 1，没有边的元素设置为 0
        for (int[] edge : edges) {
            graph[edge[0]][edge[1]] = 1;
            graph[edge[1]][edge[0]] = 1;
        }

        // 进行 BFS
        Queue<Integer> queue = new LinkedList<>();
        // 从第一个节点开始搜索，这样就不会漏掉无边图的情况
        queue.add(0);
        boolean[] visited = new boolean[n];
        while (!queue.isEmpty()) {
            // 获取并移除队列的首个元素，并在为空时返回 null
            Integer cur = queue.poll();
            visited[cur] = true;

            // 获取邻接点
            for (int i = 0; i < n; i++) {
                // 查看当前节点的邻接点
                if (graph[cur][i] == 1) {
                    // 如果访问过，返回 false
                    if (visited[i])
                        return false;

                    // 标记邻接点，入队列
                    visited[i] = true;
                    // 涂黑访问过的节点
                    graph[cur][i] = 0;
                    graph[i][cur] = 0;
                    queue.add(i);
                }
            }
        }

        for (int i = 0; i < n; i++)
            if (!visited[i])
                return false;

        return true;
    }

    // DFS
    public boolean validTree3(int n, int[][] edges) {
        int[][] graph = new int[n][n];
        for (int[] edge : edges) {
            graph[edge[0]][edge[1]] = 1;
            graph[edge[1]][edge[0]] = 1;
        }

        Deque<Integer> stack = new LinkedList<>();
        stack.add(0);
        boolean[] visited = new boolean[n];
        while (!stack.isEmpty()) {
            Integer cur = stack.pop();
            visited[cur] = true;
            for (int i = n - 1; i >= 0; i--) {
                if (graph[cur][i] == 1) {
                    if (visited[i])
                        return false;

                    visited[i] = true;
                    graph[cur][i] = 0;
                    graph[i][cur] = 0;
                    stack.push(i);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i])
                return false;
        }
        return true;
    }
}

class DisjointSet {
    int n;
    int[] parent;
    int[] rank;
    int count;

    DisjointSet(int n) {
        this.n = n;
        this.parent = new int[n];
        Arrays.fill(parent, -1);
        this.rank = new int[n];
        this.count = n;
    }

    // 寻找父结点
    private int findRoot(int x) {
        int root = x;
        while (parent[root] != -1) {
            root = parent[root];
        }
        return root;
    }

    // 父节点归并
    public boolean union(int x, int y) {
        int xRoot = findRoot(x);
        int yRoot = findRoot(y);
        // 如果两个在同一棵树上，直接返回 false
        if (xRoot == yRoot)
            return false;
        // 压缩路径
        // 找到两者的（父节点）的根结点
        // 将两者中父节点秩更低者的父节点，置为秩更高者
        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot;
        } else if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (rank[xRoot] == rank[yRoot]) {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
        count--;
        return true;
    }

    public int getCount() {
        return this.count;
    }
}*/
