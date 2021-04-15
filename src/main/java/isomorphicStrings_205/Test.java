package isomorphicStrings_205;


import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertTrue(!solution.isIsomorphic("aab","aaa"));
        Assert.assertTrue(!solution.isIsomorphic("aba","baa"));
        Assert.assertTrue(solution.isIsomorphic("paper","title"));
        Assert.assertTrue(!solution.isIsomorphic("43","11"));
    }
}
