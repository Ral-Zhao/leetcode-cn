package targetSum_494;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 1, 1, 1};
        Assert.assertEquals(5, solution.findTargetSumWays(nums, 3));
        nums = new int[]{1, 1, 1, 1, 1};
        Assert.assertEquals(5, solution.findTargetSumWays_dfs(nums, 3));
    }
}
