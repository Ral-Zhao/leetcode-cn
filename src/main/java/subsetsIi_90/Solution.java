package subsetsIi_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * <p>
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
 * 示例 2：
 * <p>
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        helper(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int index) {
        result.add(new ArrayList<>(list));
        Integer last = null;
        for (int i = index; i < nums.length; i++) {
            if (last != null && last == nums[i]) {
                continue;
            }
            list.add(nums[i]);
            last = nums[i];
            helper(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
