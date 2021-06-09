package integerBreak_343;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(36, solution.integerBreak(10));
        Assert.assertEquals(1, solution.integerBreak(2));
        Assert.assertEquals(18, solution.integerBreak(8));
    }
}
