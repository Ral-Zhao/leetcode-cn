package numberOfSquarefulArrays_996;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个非负整数数组 A，如果该数组每对相邻元素之和是一个完全平方数，则称这一数组为正方形数组。
 * <p>
 * 返回 A 的正方形排列的数目。两个排列 A1 和 A2 不同的充要条件是存在某个索引 i，使得 A1[i] != A2[i]。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,17,8]
 * 输出：2
 * 解释：
 * [1,8,17] 和 [17,8,1] 都是有效的排列。
 * 示例 2：
 * <p>
 * 输入：[2,2,2]
 * 输出：1
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 12
 * 0 <= A[i] <= 1e9
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-of-squareful-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private int count;

    public int numSquarefulPerms(int[] nums) {
        count = 0;
        List<Integer> list = new ArrayList<>();
        helper(list, nums, new int[nums.length]);
        return count;
    }

    private void helper(List<Integer> list, int[] nums, int[] visited) {
        if (list.size() == nums.length) {
            count++;
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) {
                continue;
            }
            if (set.contains(nums[i])) {
                continue;
            }
            if (list.size() > 0) {
                if (!isSquare(list.get(list.size() - 1) + nums[i])) {
                    continue;
                }
            }
            list.add(nums[i]);
            set.add(nums[i]);
            visited[i] = 1;
            helper(list, nums, visited);
            list.remove(list.size() - 1);
            visited[i] = 0;
        }
    }

    private boolean isSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
