package firstUniqueCharacterInAString_387;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.firstUniqChar("leetcode"));
        Assert.assertEquals(2, solution.firstUniqChar("loveleetcode"));
    }
}
