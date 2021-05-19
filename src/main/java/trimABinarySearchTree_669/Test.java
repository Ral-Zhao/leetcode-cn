package trimABinarySearchTree_669;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, 0, 2);
        root = solution.trimBST(root, 1, 2);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(3, 0, 4, null, 2, null, null, 1);
        root = solution.trimBST(root, 1, 3);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(1);
        root = solution.trimBST(root, 1, 2);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(1, null, 2);
        root = solution.trimBST(root, 1, 3);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(1, null, 2);
        root = solution.trimBST(root, 2, 4);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(3, 2, 4, 1);
        root = solution.trimBST(root, 2, 4);
        TreeUtil.printTree(root);
    }
}
