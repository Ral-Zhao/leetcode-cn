package checkIfWordIsValidAfterSubstitutions_1003;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isValid("aabcbc"));
        Assert.assertTrue(solution.isValid("abcabcababcc"));
        Assert.assertTrue(!solution.isValid("abccba"));
        Assert.assertTrue(!solution.isValid("cababc"));
        Assert.assertTrue(!solution.isValid("babcc"));
        Assert.assertTrue(!solution.isValid("abacbcabcc"));
    }
}
