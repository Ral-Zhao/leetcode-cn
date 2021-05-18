package convertSortedArrayToBinarySearchTree_108;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode node = solution.sortedArrayToBST(nums);
        TreeUtil.printTree(node);
    }
}
