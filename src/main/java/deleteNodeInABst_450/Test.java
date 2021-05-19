package deleteNodeInABst_450;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(5, 3, 6, 2, 4, null, 7);
        root = solution.deleteNode(root, 3);
        TreeUtil.printTree(root);
        root = TreeUtil.buildTree(5, 3, 6, 2, 4, null, 7);
        root = solution.deleteNode(root, 5);
        TreeUtil.printTree(root);
    }
}
