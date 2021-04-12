package pascalsTriangleIi_119;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * <p>
 * <p>
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出: [1,3,3,1]
 * 进阶：
 * <p>
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        rowIndex++;
        int[] before = new int[rowIndex];
        before[0] = 1;
        int[] after = new int[rowIndex];
        for (int i = 0; i < rowIndex; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    after[j] = 1;
                    continue;
                }
                after[j] = before[j - 1] + before[j];
            }
            int[] temp = before;
            before = after;
            after = temp;
        }

        for (int i = 0; i < rowIndex; i++) {
            result.add(before[i]);
        }
        return result;
    }
}
