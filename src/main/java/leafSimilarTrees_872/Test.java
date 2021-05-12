package leafSimilarTrees_872;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root1 = TreeUtil.buildTree(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4);
        TreeNode root2 = TreeUtil.buildTree(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8);
        Assert.assertTrue(solution.leafSimilar(root1, root2));
        root1 = TreeUtil.buildTree(1);
        root2 = TreeUtil.buildTree(1);
        Assert.assertTrue(solution.leafSimilar(root1, root2));
        root1 = TreeUtil.buildTree(1);
        root2 = TreeUtil.buildTree(2);
        Assert.assertTrue(!solution.leafSimilar(root1, root2));
        root1 = TreeUtil.buildTree(1, 2);
        root2 = TreeUtil.buildTree(2, 2);
        Assert.assertTrue(solution.leafSimilar(root1, root2));
        root1 = TreeUtil.buildTree(1, 2, 3);
        root2 = TreeUtil.buildTree(2, 3, 2);
        Assert.assertTrue(!solution.leafSimilar(root1, root2));
    }
}
