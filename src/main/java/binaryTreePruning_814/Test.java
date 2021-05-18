package binaryTreePruning_814;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, null, 0, 0, 1);
        root = solution.pruneTree(root);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(1, 0, 1, 0, 0, 0, 1);
        root = solution.pruneTree(root);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(1, 1, 0, 1, 1, 0, 1, 0);
        root = solution.pruneTree(root);
        TreeUtil.printTree(root);
    }
}
