package addTwoNumbersIi_445;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = ListNodeUtil.buildList(7,2,4,3);
        ListNode l2 = ListNodeUtil.buildList(5,6,4);
        ListNode result = solution.addTwoNumbers(l1,l2);
        ListNodeUtil.printNode(result);
        System.out.println("======");
        l1 = ListNodeUtil.buildList(9,9,9,9,9,9,9);
        l2 = ListNodeUtil.buildList(9,9,9,9);
        result = solution.addTwoNumbers(l1,l2);
        ListNodeUtil.printNode(result);
    }
}
