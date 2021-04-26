package minStack_155;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        Assert.assertEquals(0, minStack.getMin());
        minStack.pop();
        Assert.assertEquals(0, minStack.getMin());
    }
    /**
     * ["MinStack","push","push","push","getMin","pop","getMin"]
     * [[],[0],[1],[0],[],[],[]]
     */
}
