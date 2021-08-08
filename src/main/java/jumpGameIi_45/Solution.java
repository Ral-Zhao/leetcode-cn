package jumpGameIi_45;

import java.util.Arrays;

/**
 * 给你一个非负整数数组 nums ，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * <p>
 * 假设你总是可以到达数组的最后一个位置。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 示例 2:
 * <p>
 * 输入: nums = [2,3,0,1,4]
 * 输出: 2
 *  
 * <p>
 * 提示:
 * <p>
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 1000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jump-game-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int step = 0;
        int curEnd = 0;
        int maxCoverage = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxCoverage = Math.max(maxCoverage, nums[i] + i);
            if (maxCoverage >= nums.length - 1) {
                step++;
                break;
            }
            if (i == curEnd) {
                step++;
                curEnd = maxCoverage;
            }
        }
        return step;
    }

    /**
     * 动态规划
     */
    public int jump_2(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, nums.length);
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length && j <= i + nums[i]; j++) {
                dp[j] = Math.min(dp[i] + 1, dp[j]);
            }
        }
        return dp[nums.length - 1];
    }
}
