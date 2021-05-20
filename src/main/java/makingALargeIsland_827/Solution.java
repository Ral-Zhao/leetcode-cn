package makingALargeIsland_827;

/**
 * 在二维地图上， 0代表海洋， 1代表陆地，我们最多只能将一格 0 海洋变成 1变成陆地。
 * <p>
 * 进行填海之后，地图上最大的岛屿面积是多少？（上、下、左、右四个方向相连的 1 可形成岛屿）
 * <p>
 * 示例 1:
 * <p>
 * 输入: [[1, 0], [0, 1]]
 * 输出: 3
 * 解释: 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。
 * 示例 2:
 * <p>
 * 输入: [[1, 1], [1, 0]]
 * 输出: 4
 * 解释: 将一格0变成1，岛屿的面积扩大为 4。
 * 示例 3:
 * <p>
 * 输入: [[1, 1], [1, 1]]
 * 输出: 4
 * 解释: 没有0可以让我们变成1，面积依然为 4。
 * 说明:
 * <p>
 * 1 <= grid.length = grid[0].length <= 50
 * 0 <= grid[i][j] <= 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/making-a-large-island
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private int max;

    public int largestIsland(int[][] grid) {
        max = 0;
        boolean hasZero = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    hasZero = true;
                    helperNotChange(grid, new int[grid.length][grid[0].length], i, j, true);
                }
            }
        }
        return hasZero ? max : grid.length * grid[0].length;
    }

    private int helperNotChange(int[][] grid, int[][] visited, int row, int col, boolean change) {
        if (!validBound(grid, row, col)) {
            return 0;
        }
        if (visited[row][col] == 1) {
            return 0;
        }
        if (!change && grid[row][col] == 0) {
            return 0;
        }
        visited[row][col] = 1;
        int count = 1 + helperNotChange(grid, visited, row - 1, col, false) + helperNotChange(grid, visited, row + 1, col, false) +
                helperNotChange(grid, visited, row, col + 1, false) + helperNotChange(grid, visited, row, col - 1, false);
        max = Math.max(max, count);
        return count;

    }


    private boolean validBound(int[][] grid, int row, int col) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length;
    }
}
