package fibonacciNumber_509;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(1, solution.fib(2));
        Assert.assertEquals(2, solution.fib(3));
        Assert.assertEquals(3, solution.fib(4));
    }
}
