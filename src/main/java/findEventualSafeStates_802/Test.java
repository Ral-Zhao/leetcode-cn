package findEventualSafeStates_802;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] graph = new int[][]{{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        List<Integer> result = null;
        result = solution.eventualSafeNodes(graph);
        System.out.println(JSON.toJSONString(result));
        graph = new int[][]{{1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}};
        result = solution.eventualSafeNodes(graph);
        System.out.println(JSON.toJSONString(result));
        graph = new int[][]{{}, {0, 2, 3, 4}, {3}, {4}, {}};
        result = solution.eventualSafeNodes(graph);
        System.out.println(JSON.toJSONString(result));
    }
}
