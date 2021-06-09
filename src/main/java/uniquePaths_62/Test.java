package uniquePaths_62;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(28, solution.uniquePaths(3, 7));
        Assert.assertEquals(28, solution.uniquePaths(7, 3));
        Assert.assertEquals(3, solution.uniquePaths(3, 2));
        Assert.assertEquals(6, solution.uniquePaths(3, 3));
    }
}
