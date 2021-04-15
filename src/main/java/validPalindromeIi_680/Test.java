package validPalindromeIi_680;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertTrue(solution.validPalindrome("aba"));
        Assert.assertTrue(solution.validPalindrome("abca"));
        Assert.assertTrue(!solution.validPalindrome("abdca"));
        Assert.assertTrue(solution.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}
