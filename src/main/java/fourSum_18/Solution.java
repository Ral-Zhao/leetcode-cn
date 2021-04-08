package fourSum_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：答案中不可以包含重复的四元组。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,0,-1,0,-2,2], target = 0
 * 输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * 示例 2：
 * <p>
 * 输入：nums = [], target = 0
 * 输出：[]
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 200
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * <p>
 * 链接：https://leetcode-cn.com/problems/4sum
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right - 2) {

            int start = left + 1;
            int end = right - 1;
            int innerTarget = target - nums[left] - nums[right];
            while (start < end) {
                int temp = nums[start] + nums[end];
                if (temp < innerTarget) {
                    start++;
                } else if (temp > innerTarget) {
                    end--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    list.add(nums[right]);
                    result.add(list);
                    do {
                        start++;
                    } while (start < right && nums[start - 1] == nums[start]);
                    do {
                        end--;
                    } while (end > left && nums[end + 1] == nums[end]);
                }
            }
            do {
                right--;
            } while (right > 0 && nums[right + 1] == nums[right]);
            if (left >= right - 2) {
                right = nums.length - 1;
                do {
                    left++;
                } while (left < nums.length && nums[left - 1] == nums[left]);
            }

        }
        return result;
    }
}
