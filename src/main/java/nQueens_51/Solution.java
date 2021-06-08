package nQueens_51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * <p>
 * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
 * <p>
 * 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：n = 4
 * 输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * 解释：如上图所示，4 皇后问题存在两个不同的解法。
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：[["Q"]]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 9
 * 皇后彼此不能相互攻击，也就是说：任何两个皇后都不能处于同一条横行、纵行或斜线上。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-queens
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], '.');
        }
        List<List<String>> result = new ArrayList<>();
        helper(result, arr, 0);
        return result;
    }

    private void helper(List<List<String>> result, char[][] arr, int i) {
        if (i == arr.length) {
            List<String> list = new ArrayList<>();
            for (char[] chars : arr) {
                list.add(new String(chars));
            }
            result.add(list);
            return;
        }
        for (int j = 0; j < arr[0].length; j++) {
            if (validPosition(arr, i, j)) {
                arr[i][j] = 'Q';
                helper(result, arr, i + 1);
                arr[i][j] = '.';
            }
        }
    }

    private boolean validPosition(char[][] arr, int i, int j) {
        for (int k = 0; k < j; k++) {
            if (arr[i][k] == 'Q') {
                return false;
            }
        }
        for (int k = 0; k < i; k++) {
            if (arr[k][j] == 'Q') {
                return false;
            }
        }
        int row = i;
        int col = j;
        while (--row >= 0 && --col >= 0) {
            if (arr[row][col] == 'Q') {
                return false;
            }
        }
        row = i;
        col = j;
        while (--row >= 0 && ++col < arr[0].length) {
            if (arr[row][col] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
