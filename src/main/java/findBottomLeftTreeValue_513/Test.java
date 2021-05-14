package findBottomLeftTreeValue_513;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(2, 1, 3);
        Assert.assertEquals(1, solution.findBottomLeftValue(root));
        root = TreeUtil.buildTree(1, 2, 3, 4, 5, 6, null, null, 7);
        Assert.assertEquals(7, solution.findBottomLeftValue(root));

    }
}
