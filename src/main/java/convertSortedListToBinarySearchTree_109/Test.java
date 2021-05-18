package convertSortedListToBinarySearchTree_109;

import common.ListNode;
import common.TreeNode;
import utils.ListNodeUtil;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = ListNodeUtil.buildList(-10, -3, 0, 5, 9);
        TreeNode root = solution.sortedListToBST(head);
        TreeUtil.printTree(root);
    }
}
