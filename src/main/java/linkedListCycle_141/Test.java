package linkedListCycle_141;

import common.ListNode;
import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l2;
        Assert.assertTrue(solution.hasCycle(l1));

    }
}
