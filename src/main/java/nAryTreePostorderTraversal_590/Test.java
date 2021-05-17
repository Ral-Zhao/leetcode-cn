package nAryTreePostorderTraversal_590;

import com.alibaba.fastjson.JSON;
import common.Node;
import utils.TreeUtil;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Node root = TreeUtil.buildNTree(1, null, 3, 2, 4, null, 5, 6);
        List<Integer> result = solution.postorder(root);
        System.out.println(JSON.toJSONString(result));
        root = TreeUtil.buildNTree(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14);
        result = solution.postorder(root);
        System.out.println(JSON.toJSONString(result));
    }
}
