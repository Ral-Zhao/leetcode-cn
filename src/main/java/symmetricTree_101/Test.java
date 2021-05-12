package symmetricTree_101;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, 2, 2, 3, 4, 4, 3);
        Assert.assertTrue(solution.isSymmetric(root));
        root = TreeUtil.buildTree(1, 2, 2, null, 3, null, 3);
        Assert.assertTrue(!solution.isSymmetric(root));
        root = TreeUtil.buildTree(1, 2, 2, 3, 4, 4, 3, 5, 6, 7, 8, 8, 7, 6, 5);
        Assert.assertTrue(solution.isSymmetric(root));
    }
}
