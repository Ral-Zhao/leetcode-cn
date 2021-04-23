package partitionList_86;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNodeUtil.buildList(1,4,3,2,5,2);
        ListNode result = solution.partition(head, 3);
        ListNodeUtil.printNode(result);
        head = ListNodeUtil.buildList(5, 2, 3, 4, 3, 1, 5, 8, 2);
        result = solution.partition(head, 4);
        ListNodeUtil.printNode(result);
    }
}