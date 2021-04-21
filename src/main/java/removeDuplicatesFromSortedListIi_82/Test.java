package removeDuplicatesFromSortedListIi_82;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNodeUtil.buildList(1, 1, 2, 4, 4);
        ListNode result = solution.deleteDuplicates(head);
        ListNodeUtil.printNode(result);
        System.out.println("======");
        head = ListNodeUtil.buildList(1, 2, 3, 3, 4, 4, 5);
        result = solution.deleteDuplicates(head);
        ListNodeUtil.printNode(result);
    }
}
