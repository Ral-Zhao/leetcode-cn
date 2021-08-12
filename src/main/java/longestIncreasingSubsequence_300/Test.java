package longestIncreasingSubsequence_300;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        Assert.assertEquals(4, solution.lengthOfLIS(nums));
        Assert.assertEquals(4, solution.lengthOfLIS_2(nums));
        nums = new int[]{0, 1, 0, 3, 2, 3};
        Assert.assertEquals(4, solution.lengthOfLIS(nums));
        Assert.assertEquals(4, solution.lengthOfLIS_2(nums));
        nums = new int[]{7, 7, 7, 7, 7, 7, 7};
        Assert.assertEquals(1, solution.lengthOfLIS(nums));
        Assert.assertEquals(1, solution.lengthOfLIS_2(nums));
        nums = new int[]{4, 10, 4, 3, 8, 9};
        Assert.assertEquals(3, solution.lengthOfLIS(nums));
        Assert.assertEquals(3, solution.lengthOfLIS_2(nums));
        nums = new int[]{0};
        Assert.assertEquals(1, solution.lengthOfLIS(nums));
        Assert.assertEquals(1, solution.lengthOfLIS_2(nums));
        nums = new int[]{11, 12, 13, 14, 15, 6, 7, 8, 101, 18};
        Assert.assertEquals(6, solution.lengthOfLIS(nums));
        Assert.assertEquals(6, solution.lengthOfLIS_2(nums));
        nums = new int[]{3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12};
        Assert.assertEquals(6, solution.lengthOfLIS(nums));
        Assert.assertEquals(6, solution.lengthOfLIS_2(nums));
    }
}
