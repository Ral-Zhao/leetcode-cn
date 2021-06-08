package combinationSumIii_216;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 * <p>
 * 说明：
 * <p>
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 * <p>
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 * 示例 2:
 * <p>
 * 输入: k = 3, n = 9
 * 输出: [[1,2,6], [1,3,5], [2,3,4]]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private int k;
    private int n;

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.n = n;
        this.k = k;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(result, list, 0, new int[9], 1);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> list, int sum, int[] visited, int index) {
        if (list.size() == k) {
            if (sum == n) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = index; i <= 9; i++) {
            if (visited[i - 1] == 1) {
                continue;
            }
            list.add(i);
            visited[i - 1] = 1;
            helper(result, list, sum + i, visited, i + 1);
            list.remove(list.size() - 1);
            visited[i - 1] = 0;
        }
    }
}
