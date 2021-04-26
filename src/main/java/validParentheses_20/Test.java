package validParentheses_20;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("()[]{}"));
        Assert.assertTrue(!solution.isValid("(]"));
        Assert.assertTrue(!solution.isValid("([)]"));
        Assert.assertTrue(solution.isValid("{[]}"));
    }
}
