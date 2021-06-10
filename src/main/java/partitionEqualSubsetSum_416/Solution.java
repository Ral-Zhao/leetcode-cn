package partitionEqualSubsetSum_416;

/**
 * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,5,11,5]
 * 输出：true
 * 解释：数组可以分割成 [1, 5, 5] 和 [11] 。
 * 示例 2：
 * <p>
 * 输入：nums = [1,2,3,5]
 * 输出：false
 * 解释：数组不能分割成两个元素和相等的子集。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 200
 * 1 <= nums[i] <= 100
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-equal-subset-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum % 2 == 1) {
            return false;
        }
        sum = sum / 2;
        boolean[][] dp = new boolean[nums.length][sum + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i==0){
                    dp[i][j] = nums[i]==j;
                }else {
                    dp[i][j] = dp[i-1][j] || (j - nums[i] >= 0 && dp[i - 1][j - nums[i]]);
                }
            }
        }
        return dp[nums.length - 1][sum];

        //int[] dp = new int[W + 1];
        //dp[0] = 1;
        //for (int num : nums) {
        //    for (int i = W; i >= num; i--) {
        //        dp[i] += dp[i - num];
        //    }
        //}
        //return dp[W] != 0;
    }

}
