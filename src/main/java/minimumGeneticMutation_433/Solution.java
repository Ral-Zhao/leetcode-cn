package minimumGeneticMutation_433;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * 一条基因序列由一个带有8个字符的字符串表示，其中每个字符都属于 "A", "C", "G", "T"中的任意一个。
 * <p>
 * 假设我们要调查一个基因序列的变化。一次基因变化意味着这个基因序列中的一个字符发生了变化。
 * <p>
 * 例如，基因序列由"AACCGGTT" 变化至 "AACCGGTA" 即发生了一次基因变化。
 * <p>
 * 与此同时，每一次基因变化的结果，都需要是一个合法的基因串，即该结果属于一个基因库。
 * <p>
 * 现在给定3个参数 — start, end, bank，分别代表起始基因序列，目标基因序列及基因库，请找出能够使起始基因序列变化为目标基因序列所需的最少变化次数。
 * 如果无法实现目标变化，请返回 -1。
 * <p>
 * 注意：
 * <p>
 * 起始基因序列默认是合法的，但是它并不一定会出现在基因库中。
 * 如果一个起始基因序列需要多次变化，那么它每一次变化之后的基因序列都必须是合法的。
 * 假定起始基因序列与目标基因序列是不一样的。
 *  
 * <p>
 * 示例 1：
 * <p>
 * start: "AACCGGTT"
 * end:   "AACCGGTA"
 * bank: ["AACCGGTA"]
 * <p>
 * 返回值: 1
 * 示例 2：
 * <p>
 * start: "AACCGGTT"
 * end:   "AAACGGTA"
 * bank: ["AACCGGTA", "AACCGCTA", "AAACGGTA"]
 * <p>
 * 返回值: 2
 * 示例 3：
 * <p>
 * start: "AAAAACCC"
 * end:   "AACCCCCC"
 * bank: ["AAAACCCC", "AAACCCCC", "AACCCCCC"]
 * <p>
 * 返回值: 3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-genetic-mutation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Queue<String> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        visited.add(start);
        queue.add(start);
        int step = 0;
        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String src = queue.poll();
                for (String target : bank) {
                    if (visited.contains(target) || target.equals(src)) {
                        continue;
                    }
                    if (canMatch(src, target)) {
                        if (target.equals(end)) {
                            return step;
                        }
                        visited.add(target);
                        queue.add(target);
                    }
                }
            }
        }
        return -1;
    }

    private boolean canMatch(String src, String target) {
        int count = 0;
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) != target.charAt(i)) {
                count++;
            }
        }
        return count == 1;
    }
}
