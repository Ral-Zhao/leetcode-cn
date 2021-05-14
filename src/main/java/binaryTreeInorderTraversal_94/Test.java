package binaryTreeInorderTraversal_94;

import com.alibaba.fastjson.JSON;
import common.TreeNode;
import utils.TreeUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, null, 2, 3);
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(JSON.toJSONString(result));
    }
}
