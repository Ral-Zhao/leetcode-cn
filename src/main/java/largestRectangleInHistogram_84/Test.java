package largestRectangleInHistogram_84;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        Assert.assertEquals(10, solution.largestRectangleArea(heights));
        heights = new int[]{2, 4};
        Assert.assertEquals(4, solution.largestRectangleArea(heights));
        heights = new int[]{2, 1, 2};
        Assert.assertEquals(3, solution.largestRectangleArea(heights));
        heights = new int[]{5, 4, 1, 2};
        Assert.assertEquals(8, solution.largestRectangleArea(heights));
    }
}
