package hammingDistance_461;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.hammingDistance(1, 4));
        Assert.assertEquals(1, solution.hammingDistance(3, 1));
    }
}
