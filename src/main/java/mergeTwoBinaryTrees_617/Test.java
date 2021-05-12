package mergeTwoBinaryTrees_617;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root1 = TreeUtil.buildTree(1, 3, 2, 5);
        TreeNode root2 = TreeUtil.buildTree(2, 1, 3, null, 4, null, 7);
        TreeNode root = solution.mergeTrees(root1,root2);
        TreeUtil.levelOrderPrint(root);
    }
}
