package validateBinarySearchTree_98;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(2, 1, 3);
        Assert.assertTrue(solution.isValidBST(root));
        root = TreeUtil.buildTree(5, 1, 4, null, null, 3, 6);
        Assert.assertTrue(!solution.isValidBST(root));
        root = TreeUtil.buildTree(1, 1);
        Assert.assertTrue(!solution.isValidBST(root));
    }
}
