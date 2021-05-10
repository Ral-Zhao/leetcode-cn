package balancedBinaryTree_110;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(3, 9, 20, null, null, 15, 7);
        Assert.assertTrue(solution.isBalanced(root));
        root = TreeUtil.buildTree(1, 2, 2, 3, 3, null, null, 4, 4);
        Assert.assertTrue(!solution.isBalanced(root));
    }
}
