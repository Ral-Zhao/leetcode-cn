package minimumDepthOfBinaryTree_111;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(3, 9, 20, null, null, 15, 7);
        Assert.assertEquals(2, solution.minDepth(root));
        root = TreeUtil.buildTree(2, null, 3, null, 4, null, 5, null, 6);
        Assert.assertEquals(5, solution.minDepth(root));

    }
}
