package mergeKSortedLists_23;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = ListNodeUtil.buildList(-5, 0, 1, 5, 8);
        ListNode l2 = ListNodeUtil.buildList(-2, -1, -1, 5, 11);
        ListNode l3 = ListNodeUtil.buildList(0, 3, 4, 4, 6, 12);
        ListNode l4 = ListNodeUtil.buildList(1, 2, 5);
        ListNode[] lists = new ListNode[]{l1, l2, l3, l4};
        ListNode result = solution.mergeKLists(lists);
        ListNodeUtil.printNode(result);
    }
}
