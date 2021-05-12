package univaluedBinaryTree_965;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, 1, 1, 1, 1, null, 1);
        Assert.assertTrue(solution.isUnivalTree(root));
        root = TreeUtil.buildTree(2, 2, 2, 5, 2);
        Assert.assertTrue(!solution.isUnivalTree(root));
    }
}
