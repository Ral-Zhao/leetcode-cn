package maximalRectangle_85;

/**
 * 给定一个仅包含 0 和 1 、大小为 rows x cols 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
 * 输出：6
 * 解释：最大矩形如上图所示。
 * 示例 2：
 * <p>
 * 输入：matrix = []
 * 输出：0
 * 示例 3：
 * <p>
 * 输入：matrix = [["0"]]
 * 输出：0
 * 示例 4：
 * <p>
 * 输入：matrix = [["1"]]
 * 输出：1
 * 示例 5：
 * <p>
 * 输入：matrix = [["0","0"]]
 * 输出：0
 *  
 * <p>
 * 提示：
 * <p>
 * rows == matrix.length
 * cols == matrix[0].length
 * 0 <= row, cols <= 200
 * matrix[i][j] 为 '0' 或 '1'
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximal-rectangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return 0;
        }
        int n = matrix[0].length;
        int[][][] dp = new int[m][n][2];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '0') {
                    continue;
                }
                if (i == 0 && j == 0) {
                    dp[i][j][0] = 1;
                    dp[i][j][1] = 1;
                    max = 1;
                } else if (i == 0) {
                    dp[i][j][0] = dp[i][j - 1][0] + 1;
                    dp[i][j][1] = 1;
                    max = Math.max(max,dp[i][j][0]);
                } else if (j == 0) {
                    dp[i][j][0] = 1;
                    dp[i][j][1] = dp[i - 1][j][1] + 1;
                    max = Math.max(max,dp[i][j][1]);
                } else {
                    dp[i][j][0] = dp[i][j-1][0]+1;
                    dp[i][j][1] = dp[i-1][j][1]+1;
                    int wide = dp[i][j][1];
                    for (int k = 0; k <=j ; k++) {
                        wide = Math.min(wide,dp[i][j-k][1]);
                        max = Math.max(max,(k+1)*wide);
                    }
                }
            }
        }
        return max;
    }
}
