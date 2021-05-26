package zeroOneMatrix_542;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。
 * <p>
 * 两个相邻元素间的距离为 1 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [[0,0,0],
 * [0,1,0],
 * [0,0,0]]
 * <p>
 * 输出：
 * [[0,0,0],
 *  [0,1,0],
 *  [0,0,0]]
 * 示例 2：
 * <p>
 * 输入：
 * [[0,0,0],
 * [0,1,0],
 * [1,1,1]]
 * <p>
 * 输出：
 * [[0,0,0],
 * [0,1,0],
 * [1,2,1]]
 *  
 * <p>
 * 提示：
 * <p>
 * 给定矩阵的元素个数不超过 10000。
 * 给定矩阵中至少有一个元素是 0。
 * 矩阵中的元素只在四个方向上相邻: 上、下、左、右。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/01-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private static final int[][] DIRECTIONS = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private static final int MAX = 200000;

    /**
     * 经典BFS解法
     */
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    res[i][j] = helper(mat, i, j);
                }
            }
        }
        return res;
    }

    private int helper(int[][] mat, int i, int j) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{i, j});
        int[][] visited = new int[mat.length][mat[0].length];
        int step = 0;
        visited[i][j] = 1;
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] arr = queue.poll();
                for (int[] direction : DIRECTIONS) {
                    int m = arr[0] + direction[0];
                    int n = arr[1] + direction[1];
                    if (!valid(mat, m, n) || visited[m][n] == 1) {
                        continue;
                    }
                    if (mat[m][n] == 0) {
                        return step;
                    }
                    queue.add(new int[]{m, n});
                    visited[m][n] = 1;
                }

            }
        }
        return -1;
    }

    private boolean valid(int[][] board, int i, int j) {
        return i >= 0 && i < board.length && j >= 0 && j < board[0].length;
    }

    /**
     * 从0开始BFS
     */
    public int[][] updateMatrix_bfs(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] visited = new int[row][col];
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = MAX;
                } else {
                    queue.add(new int[]{i, j});
                    visited[i][j] = 1;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int i = arr[0];
            int j = arr[1];
            int min = mat[i][j];
            for (int[] direction : DIRECTIONS) {
                int m = i + direction[0];
                int n = j + direction[1];
                if (!valid(mat, m, n)) {
                    continue;
                }
                min = Math.min(min, mat[m][n] + 1);
                if (mat[m][n] == MAX && visited[m][n] != 1) {
                    queue.add(new int[]{m, n});
                    visited[m][n] = 1;
                }
            }
            mat[i][j] = min;
        }

        return mat;
    }

    /**
     * DP（两次遍历，可 AC）
     */
    public int[][] updateMatrix_dp(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        // 第一次遍历，正向遍历，根据相邻左元素和上元素得出当前元素的对应结果
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = row + col;
                }
                if (i > 0) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i - 1][j] + 1);
                }
                if (j > 0) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][j - 1] + 1);
                }
            }
        }
        // 第二次遍历，反向遍历，根据相邻右元素和下元素及当前元素的结果得出最终结果
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (i < row - 1) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i + 1][j] + 1);
                }
                if (j < col - 1) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][j + 1] + 1);
                }
            }
        }
        return matrix;
    }

}
