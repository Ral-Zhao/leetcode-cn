package countBinarySubstrings_696;


import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(6, solution.countBinarySubstrings("00110011"));
        Assert.assertEquals(4, solution.countBinarySubstrings("10101"));
    }
}
