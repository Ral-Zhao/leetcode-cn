package decodeWays_91;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(3,solution.numDecodings("226"));
        Assert.assertEquals(2,solution.numDecodings("12"));
        Assert.assertEquals(0,solution.numDecodings("0"));
        Assert.assertEquals(1,solution.numDecodings("4"));
        Assert.assertEquals(1,solution.numDecodings("10"));
        Assert.assertEquals(2,solution.numDecodings("23"));
        Assert.assertEquals(1,solution.numDecodings("20"));
        Assert.assertEquals(0,solution.numDecodings("10011"));
    }
}
