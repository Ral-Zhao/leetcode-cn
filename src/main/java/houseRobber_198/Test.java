package houseRobber_198;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        Assert.assertEquals(4, solution.rob(nums));
        nums = new int[]{2, 7, 9, 3, 1};
        Assert.assertEquals(12, solution.rob(nums));
        nums = new int[]{2, 7};
        Assert.assertEquals(7, solution.rob(nums));
    }
}
