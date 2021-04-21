package reverseNodesInKGroup_25;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list = ListNodeUtil.buildList(1, 2, 3, 4, 5,6);
        ListNode result = solution.reverseKGroup(list, 4);
        ListNodeUtil.printNode(result);
    }
}
