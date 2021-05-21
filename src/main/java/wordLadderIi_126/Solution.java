package wordLadderIi_126;

import java.util.*;

/**
 * 按字典 wordList 完成从单词 beginWord 到单词 endWord 转化，一个表示此过程的 转换序列 是形式上像 beginWord -> s1 -> s2 -> ... -> sk 这样的单词序列，并满足：
 * <p>
 * 每对相邻的单词之间仅有单个字母不同。
 * 转换过程中的每个单词 si（1 <= i <= k）必须是字典 wordList 中的单词。注意，beginWord 不必是字典 wordList 中的单词。
 * sk == endWord
 * 给你两个单词 beginWord 和 endWord ，以及一个字典 wordList 。请你找出并返回所有从 beginWord 到 endWord 的 最短转换序列 ，如果不存在这样的转换序列，返回一个空列表。
 * 每个序列都应该以单词列表 [beginWord, s1, s2, ..., sk] 的形式返回。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * 输出：[["hit","hot","dot","dog","cog"],["hit","hot","lot","log","cog"]]
 * 解释：存在 2 种最短的转换序列：
 * "hit" -> "hot" -> "dot" -> "dog" -> "cog"
 * "hit" -> "hot" -> "lot" -> "log" -> "cog"
 * 示例 2：
 * <p>
 * 输入：beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 * 输出：[]
 * 解释：endWord "cog" 不在字典 wordList 中，所以不存在符合要求的转换序列。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= beginWord.length <= 7
 * endWord.length == beginWord.length
 * 1 <= wordList.length <= 5000
 * wordList[i].length == beginWord.length
 * beginWord、endWord 和 wordList[i] 由小写英文字母组成
 * beginWord != endWord
 * wordList 中的所有单词 互不相同
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-ladder-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private String beginWord;

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        this.beginWord = beginWord;
        List<List<String>> result = new ArrayList<>();
        if (!wordList.contains(endWord)) {
            return result;
        }
        Map<String, Node> map = new HashMap<>();
        map.put(beginWord, new Node(beginWord));
        Queue<String> queue = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        queue.add(beginWord);
        visited.add(beginWord);
        Set<String> curVisited = new HashSet<>();
        boolean end = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String src = queue.poll();
                Node srcNode = map.get(src);
                for (String target : wordList) {
                    if (visited.contains(target) || src.equals(target)) {
                        continue;
                    }
                    if (canConvert(src, target)) {
                        Node node = map.get(target);
                        if (node == null) {
                            node = new Node(target);
                            map.put(target, node);
                        }
                        node.add(srcNode);
                        if (target.equals(endWord)) {
                            end = true;
                            break;
                        }
                        queue.add(target);
                        curVisited.add(target);
                    }
                }

            }
            visited.addAll(curVisited);
            curVisited.clear();
            if (end){
                break;
            }
        }

        helper(result, new ArrayList<>(), map.get(endWord));
        return result;
    }

    private void helper(List<List<String>> result, List<String> list, Node node) {
        if (node==null){
            return;
        }
        if (node.word.equals(beginWord) || node.prev.isEmpty()) {
            List<String> temp = new ArrayList<>();
            temp.add(beginWord);
            for (int i = list.size() - 1; i >= 0; i--) {
                temp.add(list.get(i));
            }
            result.add(temp);
            return;
        }
        Set<Node> prev = node.prev;
        for (Node prevNode : prev) {
            list.add(node.word);
            helper(result, list, prevNode);
            list.remove(list.size() - 1);
        }
    }


    private boolean canConvert(String src, String target) {
        int count = 0;
        for (int i = 0; i < src.length(); i++) {
            if (src.charAt(i) != target.charAt(i)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    private class Node {
        String word;
        Set<Node> prev = new HashSet<>();

        public Node(String word) {
            this.word = word;
        }

        public void add(Node node) {
            prev.add(node);
        }
    }
}
