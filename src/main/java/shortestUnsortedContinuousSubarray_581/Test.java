package shortestUnsortedContinuousSubarray_581;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        Assert.assertEquals(5, solution.findUnsortedSubarray(nums));
        nums = new int[]{1, 2, 3, 4};
        Assert.assertEquals(0, solution.findUnsortedSubarray(nums));
        nums = new int[]{1, 3, 7, 8, 1, 2, 3, 10};
        Assert.assertEquals(6, solution.findUnsortedSubarray(nums));
    }
}
