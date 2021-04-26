package implementStackUsingQueues_225;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        Assert.assertEquals(2, stack.top());
        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(1, stack.top());
        Assert.assertTrue(!stack.empty());
    }
}
