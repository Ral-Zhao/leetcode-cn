package removeDuplicatesFromSortedList_83;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNodeUtil.buildList(1,1, 2,3);
        ListNode result = solution.deleteDuplicates(head);
        ListNodeUtil.printNode(result);
    }
}
