package containsDuplicateIi_219;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        Assert.assertTrue(solution.containsNearbyDuplicate(nums, 3));
        nums = new int[]{1, 0, 1, 1};
        Assert.assertTrue(solution.containsNearbyDuplicate(nums, 1));
        nums = new int[]{1, 2, 3, 1, 2, 3};
        Assert.assertTrue(!solution.containsNearbyDuplicate(nums, 2));
    }
}
