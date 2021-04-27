package minimumWindowSubstring_76;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals("BANC",solution.minWindow("ADOBECODEBANC","ABC"));
        Assert.assertEquals("a",solution.minWindow("a","a"));
        Assert.assertEquals("aa",solution.minWindow("aa","aa"));
        Assert.assertEquals("baca",solution.minWindow("acbbaca","aba"));
    }

}
