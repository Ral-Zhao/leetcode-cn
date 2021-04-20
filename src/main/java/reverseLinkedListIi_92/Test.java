package reverseLinkedListIi_92;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list = ListNodeUtil.buildList(1, 2, 3, 4, 5);
        ListNode result = solution.reverseBetween(list, 2, 4);
        ListNodeUtil.printNode(result);
        System.out.println("==========");
        list = ListNodeUtil.buildList(1, 2, 3, 4, 5);
        result = solution.reverseBetween(list, 2, 5);
        ListNodeUtil.printNode(result);
        System.out.println("==========");
        list = ListNodeUtil.buildList(1, 2, 3, 4, 5);
        result = solution.reverseBetween(list, 1, 5);
        ListNodeUtil.printNode(result);
        System.out.println("==========");
        list = ListNodeUtil.buildList(1, 2, 3, 4, 5);
        result = solution.reverseBetween(list, 3, 4);
        ListNodeUtil.printNode(result);
        System.out.println("==========");
    }
}
