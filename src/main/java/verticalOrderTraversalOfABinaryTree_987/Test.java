package verticalOrderTraversalOfABinaryTree_987;

import com.alibaba.fastjson.JSON;
import common.TreeNode;
import utils.TreeUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(3, 9, 20, null, null, 15, 7);
        List<List<Integer>> result = null;
        result = solution.verticalTraversal(root);
        System.out.println(JSON.toJSONString(result));
        root = TreeUtil.buildTree(1, 2, 3, 4, 5, 6, 7);
        result = solution.verticalTraversal(root);
        System.out.println(JSON.toJSONString(result));
        root = TreeUtil.buildTree(1, 2, 3, 4, 6, 5, 7);
        result = solution.verticalTraversal(root);
        System.out.println(JSON.toJSONString(result));
        root = TreeUtil.buildTree(0, 7, 1, null, 10, 2, null, 11, null, 3, 14, 13, null, null, 4, null, null, null, null, 12, 5, null, null, 6, 9, 8);
        result = solution.verticalTraversal(root);
        System.out.println(JSON.toJSONString(result));
        root = TreeUtil.buildTree(0, 2, 1, 3, null, 5, 22, 9, 4, 12, 25, null, null, 13, 14, 8, 6, null, null, null, null, null, 27, 24, 26, null, 17, 7, null, 28, null, null, null, null, null, 19, null, 11, 10, null, null, null, 23, 16, 15, 20, 18, null, null, null, null, null, 21, null, null, 29);
        result = solution.verticalTraversal(root);
        System.out.println(JSON.toJSONString(result));
        //[[13,28],[9,24,27,16],[3,8,14,11,19],[2,4,12,7,17,26,15,20,23],[0,5,6,10,21,29],[1,25,18],[22]]
    }
}
