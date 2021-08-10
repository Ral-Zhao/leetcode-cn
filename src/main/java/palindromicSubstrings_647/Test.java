package palindromicSubstrings_647;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.countSubstrings("abc"));
        Assert.assertEquals(6, solution.countSubstrings("aaa"));
    }
}
