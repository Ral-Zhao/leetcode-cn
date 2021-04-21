package rotateList_61;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNodeUtil.buildList(1, 2, 3, 4);
        ListNode result = solution.rotateRight(head, 5);
        ListNodeUtil.printNode(result);
    }
}
