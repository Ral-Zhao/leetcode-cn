package searchA2dMatrix_74;

/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * <p>
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 * 示例 2：
 * <p>
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * 输出：false
 *  
 * <p>
 * 提示：
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 100
 * -104 <= matrix[i][j], target <= 104
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-a-2d-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m;
        if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) {
            return false;
        }
        while (start < end) {
            int mid = (start + end) / 2;
            if (matrix[mid][0] == target || matrix[mid][n - 1] == target) {
                return true;
            }
            if (matrix[mid][0] < target && matrix[mid][n - 1] > target) {
                start = mid;
                break;
            } else if (matrix[mid][0] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        int left = 0;
        int right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (matrix[start][mid] == target) {
                return true;
            } else if (matrix[start][mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return false;

    }
}
