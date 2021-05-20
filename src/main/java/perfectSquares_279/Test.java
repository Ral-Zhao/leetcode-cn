package perfectSquares_279;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(3,solution.numSquares(12));
        Assert.assertEquals(2,solution.numSquares(13));
    }
}
