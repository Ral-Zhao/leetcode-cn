package maximumDepthOfBinaryTree_104;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(3, 9, 20, null, null, 15, 7);
        Assert.assertEquals(3, solution.maxDepth(root));
    }
}
