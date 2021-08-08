package maximumSubarray_53;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, solution.maxSubArray(nums));
    }
}
