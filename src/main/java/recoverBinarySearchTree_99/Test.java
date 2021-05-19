package recoverBinarySearchTree_99;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, 3, null, null, 2);
        solution.recoverTree(root);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(3, 1, 4, null, null, 2);
        solution.recoverTree(root);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(3, null, 2, null, 1);
        solution.recoverTree(root);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(2, null, 1, null, 3);
        solution.recoverTree(root);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(1, null, 3, null, 2);
        solution.recoverTree(root);
        TreeUtil.printTree(root);

    }
}
