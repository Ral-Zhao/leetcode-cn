package insertionSortList_147;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list = ListNodeUtil.buildList(5, 2, 3, 1, 5, 2);
        ListNode result = solution.insertionSortList(list);
        ListNodeUtil.printNode(result);
    }

}
