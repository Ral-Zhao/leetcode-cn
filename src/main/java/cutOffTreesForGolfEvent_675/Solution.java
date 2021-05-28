package cutOffTreesForGolfEvent_675;

import java.util.*;

/**
 * 你被请来给一个要举办高尔夫比赛的树林砍树。树林由一个 m x n 的矩阵表示， 在这个矩阵中：
 * <p>
 * 0 表示障碍，无法触碰
 * 1 表示地面，可以行走
 * 比 1 大的数 表示有树的单元格，可以行走，数值表示树的高度
 * 每一步，你都可以向上、下、左、右四个方向之一移动一个单位，如果你站的地方有一棵树，那么你可以决定是否要砍倒它。
 * <p>
 * 你需要按照树的高度从低向高砍掉所有的树，每砍过一颗树，该单元格的值变为 1（即变为地面）。
 * <p>
 * 你将从 (0, 0) 点开始工作，返回你砍完所有树需要走的最小步数。 如果你无法砍完所有的树，返回 -1 。
 * <p>
 * 可以保证的是，没有两棵树的高度是相同的，并且你至少需要砍倒一棵树。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：forest = [[1,2,3],[0,0,4],[7,6,5]]
 * 输出：6
 * 解释：沿着上面的路径，你可以用 6 步，按从最矮到最高的顺序砍掉这些树。
 * 示例 2：
 * <p>
 * <p>
 * 输入：forest = [[1,2,3],[0,0,0],[7,6,5]]
 * 输出：-1
 * 解释：由于中间一行被障碍阻塞，无法访问最下面一行中的树。
 * 示例 3：
 * <p>
 * 输入：forest = [[2,3,4],[0,0,5],[8,7,6]]
 * 输出：6
 * 解释：可以按与示例 1 相同的路径来砍掉所有的树。
 * (0,0) 位置的树，可以直接砍去，不用算步数。
 *  
 * <p>
 * 提示：
 * <p>
 * m == forest.length
 * n == forest[i].length
 * 1 <= m, n <= 50
 * 0 <= forest[i][j] <= 10^9
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cut-off-trees-for-golf-event
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private List<List<Integer>> forest;
    private static final int[][] DIRECTIONS = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int cutOffTree(List<List<Integer>> forest) {
        this.forest = forest;
        int row = forest.size();
        int col = forest.get(0).size();
        Map<Integer, int[]> map = new TreeMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (forest.get(i).get(j) > 1) {
                    map.put(forest.get(i).get(j), new int[]{i, j});
                }
            }
        }
        int step = 0;
        int[] src = new int[]{0, 0};
        for (int[] target : map.values()) {
            int temp = getStep(src, target);
            if (temp == -1) {
                return -1;
            }
            step += temp;
            src = target;
        }
        return step;
    }

    private int getStep(int[] src, int[] target) {
        if (src[0] == target[0] && src[1] == target[1]) {
            return 0;
        }
        int row = forest.size();
        int col = forest.get(0).size();
        int[][] visited = new int[row][col];
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(src);
        visited[src[0]][src[1]] = 1;
        int step = 0;
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] arr = queue.poll();
                for (int[] direction : DIRECTIONS) {
                    int x = arr[0] + direction[0];
                    int y = arr[1] + direction[1];
                    if (x == target[0] && y == target[1]) {
                        return step;
                    }
                    if (!validBound(x, y)) {
                        continue;
                    }
                    if (visited[x][y] == 1) {
                        continue;
                    }
                    if (forest.get(x).get(y) == 0) {
                        continue;
                    }
                    visited[x][y] = 1;
                    queue.add(new int[]{x, y});

                }
            }
        }
        return -1;
    }

    private boolean validBound(int i, int j) {
        return i >= 0 && i < forest.size() && j >= 0 && j < forest.get(0).size();
    }
}
