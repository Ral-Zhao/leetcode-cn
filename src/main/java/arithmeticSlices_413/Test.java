package arithmeticSlices_413;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        Assert.assertEquals(3, solution.numberOfArithmeticSlices(nums));
        nums = new int[]{1, 2, 3, 4, 1, 3, 5, 7, 9, 9};
        Assert.assertEquals(9, solution.numberOfArithmeticSlices(nums));
        nums = new int[]{1, 2, 3, 4, 1, 3, 5, 7, 9, 7, 7, 7, 7, 3, -1, -5, -9};
        Assert.assertEquals(18, solution.numberOfArithmeticSlices(nums));
        nums = new int[]{1, 3, 5, 7, 9};
        Assert.assertEquals(6, solution.numberOfArithmeticSlices(nums));
    }
}
