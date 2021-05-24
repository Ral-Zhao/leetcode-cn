package openTheLock_752;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
        Assert.assertEquals(6, solution.openLock(deadends, "0202"));
        deadends = new String[]{"8888"};
        Assert.assertEquals(1, solution.openLock(deadends, "0009"));
        deadends = new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"};
        Assert.assertEquals(-1, solution.openLock(deadends, "8888"));
        deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
        Assert.assertEquals(0, solution.openLock(deadends, "0000"));
    }
}
