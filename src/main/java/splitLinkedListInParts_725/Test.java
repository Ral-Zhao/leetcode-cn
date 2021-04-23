package splitLinkedListInParts_725;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNodeUtil.buildList(1, 2, 3, 4, 5, 6, 7, 8);
        ListNode[] result = solution.splitListToParts(head, 10);
        for (ListNode list : result) {
            ListNodeUtil.printNode(list);
        }

    }
}
