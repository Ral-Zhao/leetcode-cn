package binaryTreePaths_257;

import com.alibaba.fastjson.JSON;
import common.TreeNode;
import utils.TreeUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, 2, 3, null, 5);
        List<String> result = solution.binaryTreePaths(root);
        System.out.println(JSON.toJSONString(result));
    }
}
