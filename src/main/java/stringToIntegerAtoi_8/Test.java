package stringToIntegerAtoi_8;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(42,solution.myAtoi("42"));
        Assert.assertEquals(4193,solution.myAtoi("4193 with words"));
        Assert.assertEquals(-42,solution.myAtoi("   -42"));
        Assert.assertEquals(0,solution.myAtoi("words and 987"));
        Assert.assertEquals(-2147483648,solution.myAtoi("-91283472332"));
        Assert.assertEquals(0,solution.myAtoi("00000-42a1234"));
    }
}
