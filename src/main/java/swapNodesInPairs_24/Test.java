package swapNodesInPairs_24;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list = ListNodeUtil.buildList(1,2,3,4,5);
        ListNode result = solution.swapPairs(list);
        ListNodeUtil.printNode(result);
        System.out.println("========");
        list = ListNodeUtil.buildList(1,2);
        result = solution.swapPairs(list);
        ListNodeUtil.printNode(result);
    }
}
