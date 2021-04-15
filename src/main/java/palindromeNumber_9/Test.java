package palindromeNumber_9;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isPalindrome(12321));
        Assert.assertTrue(!solution.isPalindrome(12331));
        Assert.assertTrue(solution.isPalindrome(121));
        Assert.assertTrue(!solution.isPalindrome(120));
    }
}
