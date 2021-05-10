package pathSumIi_113;

import com.alibaba.fastjson.JSON;
import common.TreeNode;
import utils.TreeUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1);
        List<List<Integer>> result = solution.pathSum(root, 22);
        System.out.println(JSON.toJSON(result));
        root = TreeUtil.buildTree(1, 2, 3);
        result = solution.pathSum(root, 5);
        System.out.println(JSON.toJSON(result));
    }
}
