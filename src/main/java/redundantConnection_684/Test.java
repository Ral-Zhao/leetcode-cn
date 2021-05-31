package redundantConnection_684;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] edges = new int[][]{
                {1, 2},
                {1, 3},
                {2, 3}};
        System.out.println(JSON.toJSONString(solution.findRedundantConnection(edges)));
        edges = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        System.out.println(JSON.toJSONString(solution.findRedundantConnection(edges)));
        edges = new int[][]{{3, 4}, {1, 2}, {2, 4}, {3, 5}, {2, 5}};
        System.out.println(JSON.toJSONString(solution.findRedundantConnection(edges)));
    }
}
