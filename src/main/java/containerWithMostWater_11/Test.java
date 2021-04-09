package containerWithMostWater_11;


import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assert.assertEquals(49, solution.maxArea(height));
        height = new int[]{4,3,2,1,4};
        Assert.assertEquals(16, solution.maxArea(height));
    }
}
