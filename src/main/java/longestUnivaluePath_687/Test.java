package longestUnivaluePath_687;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(5, 4, 5, 1, 1, 5);
        Assert.assertEquals(2, solution.longestUnivaluePath(root));
        root = TreeUtil.buildTree(1, 4, 5, 4, 4, 5);
        Assert.assertEquals(2, solution.longestUnivaluePath(root));
        root = TreeUtil.buildTree(1, null, 1, 1, 1, 1, 1, 1);
        Assert.assertEquals(4, solution.longestUnivaluePath(root));
    }
}
