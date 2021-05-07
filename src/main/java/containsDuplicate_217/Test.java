package containsDuplicate_217;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        Assert.assertTrue(solution.containsDuplicate(nums));
    }
}
