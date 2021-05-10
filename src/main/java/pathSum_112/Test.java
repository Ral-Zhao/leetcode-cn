package pathSum_112;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1);
        Assert.assertTrue(solution.hasPathSum(root, 22));
        root = TreeUtil.buildTree(1, 2, 3);
        Assert.assertTrue(!solution.hasPathSum(root, 5));
        root = TreeUtil.buildTree(1, 2);
        Assert.assertTrue(!solution.hasPathSum(root, 0));
    }
}
