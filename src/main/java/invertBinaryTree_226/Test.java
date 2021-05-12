package invertBinaryTree_226;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(4,2,7,1,3,6,9);
        root = solution.invertTree(root);
        TreeUtil.levelOrderPrint(root);
    }
}
