package wordSearchIi_212;


import java.util.*;

/**
 * 给定一个 m x n 二维字符网格 board 和一个单词（字符串）列表 words，找出所有同时在二维网格和字典中出现的单词。
 * <p>
 * 单词必须按照字母顺序，通过 相邻的单元格 内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。
 * 同一个单元格内的字母在一个单词中不允许被重复使用。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
 * 输出：["eat","oath"]
 * 示例 2：
 * <p>
 * <p>
 * 输入：board = [["a","b"],["c","d"]], words = ["abcb"]
 * 输出：[]
 *  
 * <p>
 * 提示：
 * <p>
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 12
 * board[i][j] 是一个小写英文字母
 * 1 <= words.length <= 3 * 10^4
 * 1 <= words[i].length <= 10
 * words[i] 由小写英文字母组成
 * words 中的所有字符串互不相同
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-search-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private static final int[][] DIRECTIONS = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private TrieNode root;
    private char[][] board;

    public List<String> findWords(char[][] board, String[] words) {
        Set<String> set = new HashSet<>();
        root = new TrieNode();
        this.board = board;
        buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                TrieNode node = root.getChild(board[i][j]);
                if (node != null) {
                    helper(set, i, j, node, "");
                }
            }
        }
        return new ArrayList<>(set);
    }

    private void buildTrie(String[] words) {
        for (String word : words) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                TrieNode child = node.getChild(ch);
                if (child == null) {
                    child = new TrieNode();
                    child.val = ch;
                    node.addChild(child);
                }
                node = child;
            }
            node.isLeaf = true;
        }
    }

    private void helper(Set<String> result, int i, int j, TrieNode node, String target) {
        if (!validBound(board, i, j) || board[i][j] == '#') {
            return;
        }
        if (board[i][j] == node.val) {
            char ch = board[i][j];
            board[i][j] = '#';
            if (node.isLeaf) {
                result.add(target + node.val);
            }
            List<TrieNode> childs = node.childs;
            for (TrieNode child : childs) {
                for (int[] direction : DIRECTIONS) {
                    helper(result, i + direction[0], j + direction[1], child, target + node.val);
                }
            }
            board[i][j] = ch;
        }
    }

    private boolean validBound(char[][] board, int i, int j) {
        return i >= 0 && i < board.length && j >= 0 && j < board[0].length;
    }

    class TrieNode {
        char val;
        List<TrieNode> childs = new ArrayList<>();
        boolean isLeaf;

        public void addChild(TrieNode node) {
            childs.add(node);
        }

        public TrieNode getChild(char val) {
            for (TrieNode node : childs) {
                if (node.val == val) {
                    return node;
                }
            }
            return null;
        }
    }
}
