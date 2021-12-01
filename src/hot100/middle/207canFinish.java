package hot100.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 深度优先搜索+拓扑排序
 * <p>实际上就是对图进行深度优先搜索，顺便看看有没有拓扑序，有环就没有拓扑序</p>
 * <p>visited 需要有为 2 的标识，因为 node 是从低到高遍历的，需要考虑类似于 [[0, 1]] 的情况</p>
 */
class Solution207 {
    private List<List<Integer>> edges;
    private int[] visited;
    private boolean legal;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        visited = new int[numCourses];
        legal = true;

        initEdges(numCourses);

        fillEdges(prerequisites);

        for (int node = 0; node < numCourses; node++) {
            if (visited[node] == 0) {
                dfs(node);
            }
        }
        return legal;
    }

    // 初始化图
    private void initEdges(int numCourses) {
        for (int node = 0; node < numCourses; node++) {
            edges.add(new ArrayList<>());
        }
    }

    // 以每个节点为起点，填充节点接下来的路径
    private void fillEdges(int[][] prerequisites) {
        for (int[] prerequisite : prerequisites) {
            edges.get(prerequisite[1]).add(prerequisite[0]);
        }
    }

    private void dfs(int node) {
        visited[node] = 1;
        for (Integer subNode : edges.get(node)) {
            if (visited[subNode] == 0) {
                dfs(subNode);

                // 减枝
                if (!legal) {
                    return;
                }
            } else if (visited[subNode] == 1) {
                legal = false;
            }
        }
        visited[node] = 2;
    }
}