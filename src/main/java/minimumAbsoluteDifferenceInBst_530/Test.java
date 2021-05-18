package minimumAbsoluteDifferenceInBst_530;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, null, 3, 2);
        Assert.assertEquals(1, solution.getMinimumDifference(root));
        root = TreeUtil.buildTree(1, 0, 48, null, null, 12, 49);
        Assert.assertEquals(1, solution.getMinimumDifference(root));
    }
}
