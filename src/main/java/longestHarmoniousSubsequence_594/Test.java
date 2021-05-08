package longestHarmoniousSubsequence_594;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
        Assert.assertEquals(5, solution.findLHS(nums));
        nums = new int[]{1, 2, 3, 4};
        Assert.assertEquals(2, solution.findLHS(nums));
        nums = new int[]{1, 1, 1, 1};
        Assert.assertEquals(0, solution.findLHS(nums));
        nums = new int[]{1, 2, 1, 3, 0, 0, 2, 2, 1, 3, 3};
        Assert.assertEquals(6, solution.findLHS(nums));
    }
}
