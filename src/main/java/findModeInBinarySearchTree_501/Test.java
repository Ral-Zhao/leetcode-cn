package findModeInBinarySearchTree_501;

import common.TreeNode;
import utils.ArrayUtil;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = TreeUtil.buildTree(1, null, 2, 2);
        int[] result = solution.findMode(node);
        ArrayUtil.printArray(result);
    }
}
