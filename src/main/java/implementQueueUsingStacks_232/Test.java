package implementQueueUsingStacks_232;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        Assert.assertEquals(1, queue.peek());
        Assert.assertEquals(1, queue.pop());
        Assert.assertTrue(!queue.empty());
    }
}
