package serializeAndDeserializeBst_449;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Codec codec = new Codec();
        TreeNode root = TreeUtil.buildTree(5, 3, 6, 2, 4, null, null, 1);
        System.out.println(codec.serialize(root));
    }
}
