package pascalsTriangle_118;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * <p>
 * <p>
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        if (numRows == 1) {
            return result;
        }
        for (int i = 2; i <= numRows; i++) {
            List<Integer> temp2 = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    temp2.add(1);
                    continue;
                }
                temp2.add(result.get(i - 2).get(j - 1) + result.get(i - 2).get(j));
            }
            result.add(temp2);
        }
        return result;

    }
}
