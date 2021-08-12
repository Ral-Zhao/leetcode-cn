package longestIncreasingSubsequence_300;


import java.util.Arrays;

/**
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * <p>
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 * <p>
 *  
 * 示例 1：
 * <p>
 * 输入：nums = [10,9,2,5,3,7,101,18]
 * 输出：4
 * 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
 * 示例 2：
 * <p>
 * 输入：nums = [0,1,0,3,2,3]
 * 输出：4
 * 示例 3：
 * <p>
 * 输入：nums = [7,7,7,7,7,7,7]
 * 输出：1
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 2500
 * -10^4 <= nums[i] <= 10^4
 *  
 * <p>
 * 进阶：
 * <p>
 * 你可以设计时间复杂度为 O(n2) 的解决方案吗？
 * 你能将算法的时间复杂度降低到 O(n log(n)) 吗?
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-increasing-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    /**
     * 方法：动态规划（这是使用动态规划解决的一个经典问题）
     * <p>
     * 明确题目中的条件：
     * <p>
     * 子序列：不要求连续子序列，只要保证元素前后顺序一致即可；
     * 上升：这里的「上升」是「严格上升」，例如： [2, 3, 3, 6, 7] 这样的子序列是不符合要求的。
     * 题目只问最长上升子序列的长度，没有问最长上升子序列是什么，因此考虑使用动态规划。
     * <p>
     * 第 1 步：状态定义。dp[i] 表示以 nums[i] 结尾的最长上升子序列的长度。即：在 [0, ..., i] 的范围内，选择以数字 nums[i] 结尾可以获得的最长上升子序列的长度。
     * <p>
     * 说明：以 nums[i] 结尾，是子序列动态规划问题的经典设计状态思路，思想是动态规划的无后效性（定义得越具体，状态转移方程越好推导）。
     * <p>
     * 第 2 步：推导状态转移方程：遍历到 nums[i] 的时候，我们应该把下标区间 [0, ... ,i - 1] 的 dp 值都看一遍，如果当前的数 nums[i] 大于之前的某个数，那么 nums[i] 就可以接在这个数后面形成一个更长的上升子序列。把前面的数都看了， dp[i] 就是它们的最大值加 $1$。即比当前数要小的那些里头，找最大的，然后加 $1$ 。
     * <p>
     * 状态转移方程即：dp[i] = max(1 + dp[j] if j < i and nums[j] < nums[i])。
     * <p>
     * 第 3 步：初始化。单独一个数是子序列，初始化的值为 1；
     * <p>
     * 第 4 步：输出。应该扫描这个 dp 数组，其中最大值的就是题目要求的最长上升子序列的长度。
     */
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }

    /**
     * 相当于维护一个结果数组，如果当前元素比结果数组的值都大的的话，就追加在结果数组后面（相当于递增序列长度加了1）；
     * 否则的话用当前元素覆盖掉第一个比它大或相等的元素（这样做的话后续递增序列才有可能更长，即使并没有更长，
     * 这个覆盖操作也并没有副作用哈，当然这个覆盖操作可能会让最终的结果数组值并不是最终的递增序列值，这无所谓）
     */
    public int lengthOfLIS_2(int[] nums) {
        int[] result = new int[nums.length];
        int next = -1;
        for (int num : nums) {
            if (next == -1 || num > result[next]) {
                result[++next] = num;
                continue;
            }
            int start = 0;
            int end = next;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (result[mid] < num) {
                    start = mid + 1;
                } else if (result[mid] > num) {
                    end = mid;
                } else {
                    start = mid;
                    break;
                }
            }
            result[start] = num;
        }
        return next + 1;
    }

}
