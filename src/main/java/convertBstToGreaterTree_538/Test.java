package convertBstToGreaterTree_538;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8);
        root = solution.convertBST(root);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(0, null, 1);
        root = solution.convertBST(root);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(1, 0, 2);
        root = solution.convertBST(root);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(3, 2, 4, 1);
        root = solution.convertBST(root);
        TreeUtil.printTree(root);
    }
}
