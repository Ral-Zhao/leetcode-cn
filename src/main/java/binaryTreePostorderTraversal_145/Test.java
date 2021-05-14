package binaryTreePostorderTraversal_145;

import com.alibaba.fastjson.JSON;
import common.TreeNode;
import utils.TreeUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, null, 2, 3);
        List<Integer> result = solution.postorderTraversal(root);
        System.out.println(JSON.toJSONString(result));
        root = TreeUtil.buildTree(3, 4, 5, 1, null, 2);
        result = solution.postorderTraversal(root);
        System.out.println(JSON.toJSONString(result));
    }
}
