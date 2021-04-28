package decodeString_394;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
        Assert.assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
        Assert.assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
        Assert.assertEquals("abccdcdcdxyz", solution.decodeString("abc3[cd]xyz"));
    }
}
