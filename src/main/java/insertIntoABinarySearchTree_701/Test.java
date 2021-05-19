package insertIntoABinarySearchTree_701;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(4, 2, 7, 1, 3);
        root = solution.insertIntoBST(root, 5);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(40, 20, 60, 10, 30, 50, 70);
        root = solution.insertIntoBST(root, 25);
        TreeUtil.printTree(root);
    }
}
