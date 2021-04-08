package sumOfSquareNumbers_633;


import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertTrue(solution.judgeSquareSum(4));
        Assert.assertTrue(solution.judgeSquareSum(5));
        Assert.assertTrue(!solution.judgeSquareSum(3));
    }
}
