package sortList_148;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNodeUtil.buildList(2, 3, 5);
        ListNode result = solution.sortList(head);
        ListNodeUtil.printNode(result);
        head = ListNodeUtil.buildList(2, 2, 2);
        result = solution.sortList(head);
        ListNodeUtil.printNode(result);
        head = ListNodeUtil.buildList(8, 2, -5, 3, 0, 7, 1, 2);
        result = solution.sortList(head);
        ListNodeUtil.printNode(result);
    }
}
