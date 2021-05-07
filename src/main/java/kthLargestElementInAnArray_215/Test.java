package kthLargestElementInAnArray_215;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        Assert.assertEquals(5, solution.findKthLargest(nums, 2));
        nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        Assert.assertEquals(4, solution.findKthLargest(nums, 4));
    }
}
