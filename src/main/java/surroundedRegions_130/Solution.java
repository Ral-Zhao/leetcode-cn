package surroundedRegions_130;

/**
 * 给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' ，找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
 * 输出：[["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
 * 解释：被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。
 * 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
 * 示例 2：
 * <p>
 * 输入：board = [["X"]]
 * 输出：[["X"]]
 *  
 * <p>
 * 提示：
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 200
 * board[i][j] 为 'X' 或 'O'
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/surrounded-regions
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[][] flag = new int[row][col];
        int[] rowArr = new int[]{0, row - 1};
        int[] colArr = new int[]{0, col - 1};
        for (int i = 0; i < rowArr.length; i++) {
            for (int j = 0; j < col; j++) {
                if (board[rowArr[i]][j] == 'O') {
                    fill(board, rowArr[i], j, flag);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colArr.length; j++) {
                if (board[i][colArr[j]] == 'O') {
                    fill(board, i, colArr[j], flag);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O' && flag[i][j] != 1) {
                    board[i][j] = 'X';
                }
            }
        }

    }

    private void fill(char[][] board, int row, int col, int[][] flag) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] == 'X' || flag[row][col] == 1) {
            return;
        }
        flag[row][col] = 1;
        fill(board, row + 1, col, flag);
        fill(board, row - 1, col, flag);
        fill(board, row, col + 1, flag);
        fill(board, row, col - 1, flag);
    }

}
