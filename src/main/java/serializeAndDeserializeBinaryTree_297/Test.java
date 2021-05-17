package serializeAndDeserializeBinaryTree_297;

import common.TreeNode;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Codec codec = new Codec();
        TreeNode root = TreeUtil.buildTree(1, 2, 3, null, null, 4, 5);
        TreeNode node = codec.deserialize(codec.serialize(root));
        TreeUtil.levelOrderPrint(node);
        root = TreeUtil.buildTree(1, 2);
        node = codec.deserialize(codec.serialize(root));
        TreeUtil.levelOrderPrint(node);
    }
}
