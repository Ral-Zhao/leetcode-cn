package intersectionOfTwoLinkedLists_160;

import common.ListNode;
import utils.ListNodeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list = ListNodeUtil.buildList(1,2);
        ListNode h1 = new ListNode(9);
        h1.next = list;
        ListNode h2 = new ListNode(20);
        h2.next = list;
        ListNode result = solution.getIntersectionNode(h1,h2);
        System.out.println(result.val);

    }
}
