package mapSumPairs_677;

import java.util.HashMap;
import java.util.Map;

/**
 * 实现一个 MapSum 类，支持两个方法，insert 和 sum：
 * <p>
 * MapSum() 初始化 MapSum 对象
 * void insert(String key, int val) 插入 key-val 键值对，字符串表示键 key ，整数表示值 val 。
 * 如果键 key 已经存在，那么原来的键值对将被替代成新的键值对。
 * int sum(string prefix) 返回所有以该前缀 prefix 开头的键 key 的值的总和。
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：
 * ["MapSum", "insert", "sum", "insert", "sum"]
 * [[], ["apple", 3], ["ap"], ["app", 2], ["ap"]]
 * 输出：
 * [null, null, 3, null, 5]
 * <p>
 * 解释：
 * MapSum mapSum = new MapSum();
 * mapSum.insert("apple", 3);
 * mapSum.sum("ap");           // return 3 (apple = 3)
 * mapSum.insert("app", 2);
 * mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= key.length, prefix.length <= 50
 * key 和 prefix 仅由小写英文字母组成
 * 1 <= val <= 1000
 * 最多调用 50 次 insert 和 sum
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/map-sum-pairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MapSum {
    private Map<String, Integer> map;
    private Node root;

    /**
     * Initialize your data structure here.
     */
    public MapSum() {
        map = new HashMap<>();
        root = new Node();
    }

    public void insert(String key, int val) {
        map.put(key, val);
        Node node = root;
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            Node temp = node.child[ch - 'a'];
            if (temp == null) {
                temp = new Node();
                temp.val = ch;
                node.child[ch - 'a'] = temp;
            }
            node = temp;
        }
        node.isLeaf = true;
    }

    public int sum(String prefix) {
        int count = 0;
        Node node = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            Node temp = node.child[ch - 'a'];
            if (temp == null) {
                return count;
            }
            node = temp;
        }
        return calc(node, prefix.substring(0, prefix.length() - 1));
    }

    private int calc(Node node, String prefix) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (node.isLeaf) {
            count = map.getOrDefault(prefix + node.val, 0);
        }
        Node[] child = node.child;
        if (child != null) {
            for (Node childNode : child) {
                if (childNode != null) {
                    count += calc(childNode, prefix + node.val);
                }
            }
        }
        return count;
    }

    private class Node {
        char val;
        Node[] child;
        boolean isLeaf;

        public Node() {
            child = new Node[26];
            isLeaf = false;
        }
    }
}
