package binaryTreeLevelOrderTraversal_102;

import com.alibaba.fastjson.JSON;
import common.TreeNode;
import utils.TreeUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(3, 9, 20, null, null, 15, 7);
        List<List<Integer>> list = solution.levelOrder(root);
        System.out.println(JSON.toJSONString(list));
    }
}
