package onesAndZeroes_474;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = new String[]{"10", "0001", "111001", "1", "0"};
        Assert.assertEquals(4, solution.findMaxForm(strs, 5, 3));
        strs = new String[]{"10", "0", "1"};
        Assert.assertEquals(2, solution.findMaxForm(strs, 1, 1));
    }
}
