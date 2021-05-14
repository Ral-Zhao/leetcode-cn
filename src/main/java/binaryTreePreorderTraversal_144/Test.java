package binaryTreePreorderTraversal_144;

import com.alibaba.fastjson.JSON;
import common.TreeNode;
import utils.TreeUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, null, 2, 3);
        List<Integer> result = solution.preorderTraversal(root);
        System.out.println(JSON.toJSONString(result));
        root = TreeUtil.buildTree(1, null, 2);
        result = solution.preorderTraversal(root);
        System.out.println(JSON.toJSONString(result));
    }
}
