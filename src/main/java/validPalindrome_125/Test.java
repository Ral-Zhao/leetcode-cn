package validPalindrome_125;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertTrue(!solution.isPalindrome("race a car"));
        Assert.assertTrue(!solution.isPalindrome("abca"));
        Assert.assertTrue(solution.isPalindrome("abba"));
        Assert.assertTrue(solution.isPalindrome("abcicba"));
        Assert.assertTrue(solution.isPalindrome(" a "));
        Assert.assertTrue(!solution.isPalindrome(" a b"));
        Assert.assertTrue(solution.isPalindrome("  "));
        Assert.assertTrue(solution.isPalindrome("...,"));
        Assert.assertTrue(solution.isPalindrome(",a"));
    }
}
