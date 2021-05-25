package pacificAtlanticWaterFlow_417;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 给定一个 m x n 的非负整数矩阵来表示一片大陆上各个单元格的高度。
 * “太平洋”处于大陆的左边界和上边界，而“大西洋”处于大陆的右边界和下边界。
 * <p>
 * 规定水流只能按照上、下、左、右四个方向流动，且只能从高到低或者在同等高度上流动。
 * <p>
 * 请找出那些水流既可以流动到“太平洋”，又能流动到“大西洋”的陆地单元的坐标。
 * <p>
 *  
 * <p>
 * 提示：
 * <p>
 * 输出坐标的顺序不重要
 * m 和 n 都小于150
 *  
 * <p>
 * 示例：
 * <p>
 *  
 * <p>
 * 给定下面的 5x5 矩阵:
 * <p>
 * 太平洋 ~   ~   ~   ~   ~
 * ~  1   2   2   3  (5) *
 * ~  3   2   3  (4) (4) *
 * ~  2   4  (5)  3   1  *
 * ~ (6) (7)  1   4   5  *
 * ~ (5)  1   1   2   4  *
 * *   *   *   *   * 大西洋
 * <p>
 * 返回:
 * <p>
 * [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (上图中带括号的单元).
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pacific-atlantic-water-flow
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int row = heights.length;
        int col = heights[0].length;
        int[][] pacific = new int[row][col];
        int[][] atlantic = new int[row][col];
        for (int i = 0; i < col; i++) {
            helper(heights, 0, i, pacific, heights[0][i]);
        }
        for (int i = 0; i < row; i++) {
            helper(heights, i, 0, pacific, heights[i][0]);
        }
        for (int i = 0; i < col; i++) {
            helper(heights, row - 1, i, atlantic, heights[row - 1][i]);
        }
        for (int i = 0; i < row; i++) {
            helper(heights, i, col - 1, atlantic, heights[i][col - 1]);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (pacific[i][j] == 1 && atlantic[i][j] == 1) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    result.add(list);
                }
            }
        }
        return result;
    }

    private void helper(int[][] heights, int i, int j, int[][] mark, int val) {
        if (i < 0 || i >= heights.length || j < 0 || j >= heights[0].length
                || mark[i][j] == 1 || heights[i][j] < val) {
            return;
        }
        mark[i][j] = 1;
        helper(heights, i, j - 1, mark, heights[i][j]);
        helper(heights, i, j + 1, mark, heights[i][j]);
        helper(heights, i + 1, j, mark, heights[i][j]);
        helper(heights, i - 1, j, mark, heights[i][j]);
    }

}
