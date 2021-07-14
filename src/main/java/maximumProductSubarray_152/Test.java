package maximumProductSubarray_152;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 3, -2, 4};
        Assert.assertEquals(6, solution.maxProduct(nums));
        nums = new int[]{-2, 0, -1};
        Assert.assertEquals(0, solution.maxProduct(nums));
    }
}
