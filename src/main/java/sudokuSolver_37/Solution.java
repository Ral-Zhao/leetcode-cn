package sudokuSolver_37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 编写一个程序，通过填充空格来解决数独问题。
 * <p>
 * 数独的解法需 遵循如下规则：
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * <p>
 * 输入：board = [["5","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
 * 输出：[["5","3","4","6","7","8","9","1","2"],["6","7","2","1","9","5","3","4","8"],["1","9","8","3","4","2","5","6","7"],["8","5","9","7","6","1","4","2","3"],["4","2","6","8","5","3","7","9","1"],["7","1","3","9","2","4","8","5","6"],["9","6","1","5","3","7","2","8","4"],["2","8","7","4","1","9","6","3","5"],["3","4","5","2","8","6","1","7","9"]]
 * 解释：输入的数独如上图所示，唯一有效的解决方案如下所示：
 * <p>
 * <p>
 *  
 * <p>
 * 提示：
 * <p>
 * board.length == 9
 * board[i].length == 9
 * board[i][j] 是一位数字或者 '.'
 * 题目数据 保证 输入数独仅有一个解
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sudoku-solver
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    private boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        for (int i = col; i < board[0].length; i++) {
            if (board[row][i] != '.') {
                continue;
            }
            for (int k = 1; k <= 9; k++) {
                if (validPosition(board, row, i, (char) (k + '0'))) {
                    board[row][i] = (char) (k + '0');
                    if (!helper(board, row, i + 1)) {
                        board[row][i] = '.';
                    }
                }
            }
            if (board[row][i] == '.') {
                return false;
            }
        }
        return helper(board, row + 1, 0);
    }

    private boolean validPosition(char[][] board, int i, int j, char target) {
        for (int k = 0; k < board[0].length; k++) {
            if (board[i][k] == target) {
                return false;
            }
        }
        for (int k = 0; k < board.length; k++) {
            if (board[k][j] == target) {
                return false;
            }
        }
        int startX = i - i % 3;
        int startY = j - j % 3;
        for (int k = startX; k < startX + 3; k++) {
            for (int l = startY; l < startY + 3; l++) {
                if (board[k][l] == target) {
                    return false;
                }
            }
        }
        return true;
    }
}
