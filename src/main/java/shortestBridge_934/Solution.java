package shortestBridge_934;

import com.alibaba.fastjson.JSON;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 在给定的二维二进制数组 A 中，存在两座岛。（岛是由四面相连的 1 形成的一个最大组。）
 * <p>
 * 现在，我们可以将 0 变为 1，以使两座岛连接起来，变成一座岛。
 * <p>
 * 返回必须翻转的 0 的最小数目。（可以保证答案至少是 1 。）
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：A = [[0,1],[1,0]]
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：A = [[0,1,0],[0,0,0],[0,0,1]]
 * 输出：2
 * 示例 3：
 * <p>
 * 输入：A = [[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
 * 输出：1
 *  
 * <p>
 * 提示：
 * <p>
 * 2 <= A.length == A[0].length <= 100
 * A[i][j] == 0 或 A[i][j] == 1
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-bridge
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private static final int[][] DIRECTIONS = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int shortestBridge(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int min = Integer.MAX_VALUE;
        List<int[]> list = new ArrayList<>();
        int[][] visited = new int[row][col];
        boolean end = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    bfs(grid, list, i, j, visited);
                    end = true;
                    break;
                }
            }
            if (end) {
                break;
            }
        }

        for (int[] arr : list) {
            min = Math.min(min, bridge(grid, arr, visited));
        }
        return min;
    }

    private int bridge(int[][] grid, int[] arr, int[][] visited) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(arr);
        int[][] innerVisited = new int[grid.length][grid[0].length];
        int step = 0;
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] a = queue.poll();
                for (int[] direction : DIRECTIONS) {
                    int x = a[0] + direction[0];
                    int y = a[1] + direction[1];
                    if (!validBound(grid, x, y)) {
                        continue;
                    }
                    if (visited[x][y] == 1 || innerVisited[x][y] == 1) {
                        continue;
                    }
                    if (grid[x][y] == 1) {
                        return step - 1;
                    }
                    queue.add(new int[]{x, y});
                    innerVisited[x][y] = 1;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    private int bfs(int[][] grid, List<int[]> bound, int i, int j, int[][] visited) {
        if (!validBound(grid, i, j) || visited[i][j] == 1) {
            return 1;
        }
        if (grid[i][j] == 0) {
            return 0;
        }
        visited[i][j] = 1;
        if ((bfs(grid, bound, i + 1, j, visited) + bfs(grid, bound, i - 1, j, visited)
                + bfs(grid, bound, i, j + 1, visited) + bfs(grid, bound, i, j - 1, visited)) < 4) {
            bound.add(new int[]{i, j});
        }
        return grid[i][j];
    }

    private boolean validBound(int[][] grid, int i, int j) {
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length;
    }
}
